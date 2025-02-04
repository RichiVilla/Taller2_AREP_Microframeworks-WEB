# Taller2_AREP_Microframeworks-WEB

## Project Summary

The "WebServer" project is a Java-based lightweight web server designed to handle HTTP requests and serve static files or dynamic responses based on registered services. The project includes core functionality for defining, managing, and testing custom web services.

## Architecture
```
WebServer/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── edu/
│   │   │       └── escuelaing/
│   │   │           ├── App.java          # Main class for managing the server and services
│   │   │           ├── Request.java      # Class for handling HTTP requests
│   │   │           ├── Response.java     # Class for handling HTTP responses
│   │   │           ├── Service.java      # Class for defining registered services
│   │   │           └── WebServer.java    # Class responsible for starting the server
│   │   │
│   │   └── resources/
│   │       ├── index.html      # Static HTML file served by the server
│   │       ├── script.js       # JavaScript file for interactivity
│   │       └── styles.css      # CSS file for styling
│
├── test/
│   ├── java/
│   │   └── edu/
│   │       └── escuelaing/
│   │           ├── AppTest.java          # Unit tests for the App class
│   │           ├── RequestTest.java      # Unit tests for the Request class
│   │           ├── ResponseTest.java     # Unit tests for the Response class
│   │           └── WebServerTest.java    # Unit tests for the WebServer class

```

## Testing the Server Locally

To use the server locally, follow these steps:

1. Clone the repository into your desired folder:
``` 
git clone https://github.com/RichiVilla/Taller2_AREP_Microframeworks-WEB.git
```

2. Open the cloned folder in your preferred IDE

3. Run the App.java file:
   
4. Open the following address in your browser:
```
   http://localhost:8080
```

![image](https://github.com/user-attachments/assets/9cfd25cc-ec6c-4738-b46f-c22887b0b8ac)


  
## Testing and Deployment

### Testing the App

Once the server is running, you can use the following four REST services:

1. "Saludo": Provides a brief greeting.
   
![image](https://github.com/user-attachments/assets/054a3418-dc5d-45c8-b2fe-a3e834a6abde)


3. "Valor de Pi": Displays the value of Pi.

![image](https://github.com/user-attachments/assets/aea04922-c97d-4908-9494-58a4f1d74260)


4. "Suma de dos números": Shows the sum of two desired numbers.
   
![image](https://github.com/user-attachments/assets/95e308e4-aff7-4b46-8698-2766244ecfaa)


### Checking URIs

We can use too the following requests to test the services:
1. "Saludo":
   a. Without a name
```
   http://localhost:8080/App/hello
```

![image](https://github.com/user-attachments/assets/ec31d44a-823a-479e-99fb-43ef23446b67)

b. With a name

```
   http://localhost:8080/App/hello?name=Richi
```
![image](https://github.com/user-attachments/assets/bc75fd53-c2b8-43b4-8ea7-2638c55f9989)


2. "Valor de Pi":
 ```
http://localhost:8080/App/pi
```
![image](https://github.com/user-attachments/assets/a95e2b18-c830-47d6-98cd-1324f2a7fd1f)



3. "Suma de dos números":

  a. Valid input
 ```
http://localhost:8080/App/sum?num1=5.75&num2=10.34
```

![image](https://github.com/user-attachments/assets/7c63a6d9-af6c-44ef-be25-b8cfdf5871de)

a. Invalid input
 ```
http://localhost:8080/App/sum?num1=a&num2=10
```
![image](https://github.com/user-attachments/assets/eaa64d0d-4249-4c99-b7b1-b84bd5f6332c)

### Unit Tests
In the project we have test for all our components that we can try.

1. App Test:
   
![image](https://github.com/user-attachments/assets/d0dfa38b-3408-435b-b426-e3c46d089059)


2. RequestTest:
   
![image](https://github.com/user-attachments/assets/de715267-3f59-434a-a662-83c3e224f4b1)


3. ResponseTest:
   
![image](https://github.com/user-attachments/assets/681ddb47-957c-481d-bd79-06185bc37ec4)


4. WebServerTest:

![image](https://github.com/user-attachments/assets/8a02a207-23c9-48eb-83fb-fcd300592459)
