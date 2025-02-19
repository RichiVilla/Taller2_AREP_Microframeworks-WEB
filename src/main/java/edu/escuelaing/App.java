package edu.escuelaing;

import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<String, Service> services = new HashMap<>();
    private static String staticFilesLocation = "";

    public static void main(String[] args) {
        staticfiles("src/main/resources");
        get("/hello", (req, resp) -> {
            String name = req.getValues("name");
            return name != null && !name.isEmpty() ? "Hola " + name : "Hola usuario!";
        });
        get("/pi", (req, resp) -> String.valueOf(Math.PI));
        get("/sum", (req, resp) -> {
            try {
                double num1 = Double.parseDouble(req.getValues("num1"));
                double num2 = Double.parseDouble(req.getValues("num2"));
                return String.valueOf(num1 + num2);
            } catch (NumberFormatException e) {
                return "Error: Parámetros inválidos";
            }
        });


        WebServer.getInstance().startServer();
    }

    public static void get(String url, Service s) {
        services.put("/App" + url, s);
        System.out.println("Service registered in: /App" + url);
    }

    public static void staticfiles(String location) {
        staticFilesLocation = location;
    }

    public static Map<String, Service> getServices() {
        return services;
    }

    public static String getStaticFilesLocation() {
        return staticFilesLocation;
    }
}