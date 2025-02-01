# Aashray Project

## Features
- ✅ **User Registration & Login**
- ✅ **MongoDB Atlas Integration**
- ✅ **Spring Boot with REST APIs**
- ✅ **Security with Spring Security**
- ✅ **CORS Configuration for Frontend Communication**

## Tech Stack
- **Spring Boot 3.4.2**
- **MongoDB Atlas**
- **Spring Security**
- **Java 21**

## Setup Instructions

### Prerequisites
- Java 21
- MongoDB Atlas account
- Spring Boot 3.4.2

### Installation
1. Clone the repository:
   ```bash
   git clone <your-repository-url>
## Installation
- ✅ **Navigate to the project directory**

      cd aashray
## Installation
  **Install dependencies and build the project**

    ./mvnw clean install
## Installation
  **Set up MongoDB Atlas connection in application.properties**  

    Open the src/main/resources/application.properties file.
## Installation
  **Add your MongoDB Atlas URI in the following format:**
   
    spring.data.mongodb.uri=mongodb+srv://<your-atlas-username>:<your-atlas-password>@<your-cluster-name>/<your-database-name>
## Installation
  **Run the application**
    
    ./mvnw spring-boot:run
## Installation
**Access the backend on http://localhost:5000 and the frontend on http://localhost:5001**
**This section now includes all the installation steps you need, from cloning the repository to running the application, with a clear instruction for setting up MongoDB Atlas.**

