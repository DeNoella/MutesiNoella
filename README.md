## Site Construction Management System (REAL CONSTRUCTOR)
This Java program is designed to simulate material handling and cost tracking on a construction site using Object-Oriented Programming (OOP) principles. The program uses an abstract class to define common methods and attributes for managing materials, material usage, and cost estimation.

Key Classes:

# ConstructionMaterial (Abstract Class): A blueprint for managing materials with abstract methods to process deliveries, usage, and cost estimations.

MaterialDelivery: Handles the delivery of materials to the construction site and updates the available material balance.

MaterialUsage: Manages the use of materials during construction and ensures enough materials are available.

CostEstimation: Calculates the cost of materials used, applying specific rules based on material quantity.

# Implementation Highlights:

Validation: Ensures that material deliveries and usage comply with predefined rules (e.g., material quantity limits).

Cost Calculation: Material cost is calculated based on predefined ranges for quantities.

# Main Class: Accepts user input for contractor details, material quantity, and performs necessary validations.

## Hotel Management System (LEMIGO HOTEL)
The LEMIGO HOTEL management system uses OOP principles to handle guest reservations, checkouts, and billing. It features an abstract class for common operations and three subclasses that implement hotel services.

# Key Classes:

HotelService (Abstract Class): A blueprint with abstract methods to book rooms, check out guests, and generate bills.

RoomBooking: Manages room booking based on availability and validates stay duration.

GuestCheckout: Handles guest checkout and room status update.

Billing: Calculates and displays the total cost based on room type and stay duration.

# Implementation Highlights:

Room Status: Ensures room availability is checked before booking and that rooms are marked as available after checkout.

Billing: Displays the guest's bill with cost breakdown based on room type.

Validation: Ensures that stay durations and room statuses are valid before proceeding with booking and checkout.

## Traffic Fine Management System (Rwanda National Police)
This program is designed to manage traffic violations, fines, and payments for the Rwanda National Police using OOP principles. It employs an abstract class to define common operations related to traffic records.

# Key Classes:

TrafficRecord (Abstract Class): A blueprint for recording violations, assessing fines, and processing payments.

ViolationEntry: Records traffic violations for drivers and validates the violation type.

FineAssessment: Calculates the fine based on the violation type and sets the amount.

FinePayment: Handles the payment process and updates the fine status.

# Implementation Highlights:

Violation Recording: Ensures that only recognized violation types are recorded.

Fine Assessment: Calculates fines based on violation type, with specific amounts for different violations.

Payment Handling: Ensures that fines are only paid once, with proper receipt generation.

## General Features Across Projects:
Abstract Classes: Each system uses abstract classes to define common methods and attributes, ensuring code reusability and flexibility.

Validation and Error Handling: Input validation is used to prevent incorrect values for attributes like quantity, room availability, or violation type.

Encapsulation: All classes make use of constructors, getter, and setter methods to encapsulate data, ensuring that objects interact through defined interfaces.

## Technologies Used:
Java (for object-oriented programming)

Object-Oriented Design (abstract classes, inheritance, and polymorphism)

Java Scanner (for user input)

Validation (input constraints and error handling)

This README outlines the design principles and implementation details of the Site Construction Management System, Hotel Management System, and Traffic Fine Management System projects, showcasing the use of OOP principles to solve real-world problems in Java.
