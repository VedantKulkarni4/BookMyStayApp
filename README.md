# Book My Stay App

This project presents the design and implementation of a **Hotel Booking Management System** to demonstrate the practical application of **Core Java concepts and fundamental data structures** in real-world scenarios.

The system is developed incrementally, with each use case introducing a specific concept that addresses common software engineering challenges such as **fair request handling, inventory consistency, and prevention of double-booking**.

By focusing on **core logic and system behavior rather than user interface design**, the project helps learners understand not only **how data structures are used**, but also **why they are important in building scalable and maintainable software systems**.

---

# Use Case 2: Basic Room Types & Static Availability

## Goal
Introduce **object modeling using inheritance and abstraction** before introducing data structures.  
This allows learners to focus on **domain design and object-oriented principles** rather than optimization.

---

## Actor
**User** – runs the application to view predefined room types and their availability.

---

## Flow

1. User runs the application.
2. Room objects representing different room types are created.
3. Availability for each room type is stored using simple variables.
4. Room details and availability information are printed to the console.
5. Application terminates.

---

# Key Concepts Used

## Abstract Class
An abstract class represents a generalized concept that should not be instantiated directly.  
The `Room` class defines common attributes and behaviors shared by all room types while enforcing a consistent structure.

## Inheritance
Concrete room classes (`SingleRoom`, `DoubleRoom`, `SuiteRoom`) extend the abstract `Room` class.  
This allows shared properties and behaviors to be reused while enabling specialization for each room type.

## Polymorphism
Room objects are referenced using the **Room type**, allowing different room implementations to be handled uniformly.  
This design prepares the system for future extensibility without modifying client code.

## Encapsulation
Room attributes such as **number of beds, size, and price** are encapsulated within the `Room` class.  
This ensures that room properties are accessed and modified through controlled methods.

## Static Availability Representation
Room availability is stored using **simple variables instead of advanced data structures**.  
This approach highlights the limitations of hardcoded state management.

## Separation of Domain and State
Room objects represent **what a room is**, while availability variables represent **the current system state**.

---

# Key Requirements

- Define an **abstract `Room` class** with common attributes.
- Create concrete classes for **Single Room, Double Room, and Suite Room**.
- Initialize room objects in the main application.
- Store room availability using individual variables.
- Display room details and availability to the console.

---

# Key Benefits

- Clear introduction to **object-oriented domain modeling**
- Demonstrates **inheritance and abstraction in a real-world context**
- Builds a strong foundation for future **inventory management and system expansion**

---

# Drawbacks of Previous Use Case

**Use Case 1** focused only on application startup and execution flow.

No domain modeling or real business concepts were introduced, which limited the realism of the system.

---

# Compilation and Execution

Compile the program using:

```bash
javac UseCase2RoomInitialization.java