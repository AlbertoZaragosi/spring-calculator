# Basic Calculator Microservice

A simple microservice built with **Spring Boot** that performs basic arithmetic operations (addition, subtraction, multiplication, and division). The service exposes a single endpoint to process calculations based on query parameters.

## Features
- Supports the following operations:
  - Addition (`sum`)
  - Subtraction (`subtract`)
  - Multiplication (`multiply`)
  - Division (`divide`)
- Lightweight and easy to use.
- Text-based responses (e.g., `"Result: 15.0"`).

## Requirements
- **Java 17** or higher.
- **Maven** for dependency management and building the project.

## How to Run
1. Clone the repository:
2. Navigate to the project directory
3. Build and run the application: (mvn spring-boot:run)
4. The service will be available at http://localhost:8080

#Usage
To use the microservice, send a GET request to the /calculate endpoint with the following query parameters:

op: The operation to perform (sum, subtract, multiply, divide).
a: The first number (operand).
b: The second number (operand).

Example:
http://localhost:8080/calculate?op=sum&a=10&b=5
