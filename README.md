# Book My Stay App

## Project Overview

**Book My Stay App** is a Hotel Booking Management System designed to demonstrate the practical application of **Core Java** and **fundamental data structures** in real-world software development.

The project is developed incrementally through multiple **use cases**, where each use case introduces a specific concept used in building scalable and reliable systems. These concepts address common software engineering challenges such as:

* Fair request handling
* Inventory consistency
* Prevention of double booking

The primary focus of this project is on **core system logic and behavior**, rather than graphical user interfaces. This allows learners to understand **how and why data structures and programming principles are used in production systems**.

---

# Use Case 1: Application Entry & Welcome Message

## Goal

Establish a clear and predictable starting point for the Hotel Booking application by demonstrating how a Java program begins execution and produces console output.

---

## Actor

**User** – runs the application from the command line or an IDE.

---

## Application Flow

1. The user runs the application.
2. The Java Virtual Machine (JVM) invokes the `main()` method.
3. The application prints a welcome message with the application name and version.
4. The application terminates after displaying the message.

---

# Key Concepts Used

### Class

Every Java application must be defined inside a class.
The class acts as the container for application behavior and defines the logical boundary of the program.

### main() Method

The `main()` method is the **entry point** of every standalone Java application.
The JVM looks for the following method signature to start execution:

```
public static void main(String[] args)
```

### static Keyword

The `main()` method is declared `static` so it can run **without creating an object of the class**.
This allows the JVM to directly start program execution.

### Console Output

`System.out.println()` is used to display output on the console.
It is commonly used during early development to observe program behavior.

### String Literals

Text inside double quotes such as `"Hotel Booking System v1.0"` is called a **String literal**.
String literals are immutable and stored in the **String Pool**.

### Method Invocation

Calling `println()` on `System.out` demonstrates how methods are invoked on objects in Java.

### Application Flow

Program execution proceeds **top to bottom** inside the `main()` method unless control structures modify the flow.

### JavaDoc Comments

JavaDoc comments document the purpose of the class and its behavior, helping maintain professional code documentation.

### JavaDoc Annotations

Tags such as `@author` and `@version` provide metadata and help maintain traceability as the system evolves.

---

# Key Requirements

* Create a Java class that represents the application entry point.
* Implement the `main()` method using the correct signature.
* Print a welcome message to the console.
* Display the application name and version.
* Use JavaDoc comments for documentation.
* Ensure the program executes without errors.

---

# How to Compile and Run

### Compile the program

```
javac UseCase1HotelBookingApp.java
```

### Run the program

```
java 

```

---

# Expected Output

```
Welcome to Book My Stay App
Hotel Booking System v1.0
Application started successfully!
```

---

# Key Benefits

* Clear and predictable application startup behavior
* Single, well-defined execution entry point
* Improved debugging during early development

---

This project will continue to evolve through additional **use cases**, each introducing new concepts related to **Java programming, data structures, and system design**.
