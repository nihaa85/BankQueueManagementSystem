Bank Queue Management System

Overview:

This project is a console-based application designed to simulate customer flow management in a bank. It utilizes the Queue Data Structure to ensure customers are served in the exact order of their arrival, strictly following the First-In-First-Out (FIFO) principle. This system helps in reducing chaos and waiting times, providing a systematic approach to banking operations.

Key Features:

Add Customer: Register a new customer into the waiting queue.
Serve Customer: Process and remove the customer at the front of the line.
Display Queue: View a real-time list of all customers currently waiting for service.
Robust Input Handling: Prevents crashes from invalid inputs.
Technical Implementation
The application is built using Java. It leverages the Java Collections Framework, specifically the Queue interface implemented via a LinkedList. This ensures efficient O(1) time complexity for adding (enqueuing) and removing (dequeuing) customers.

Execution:

To run the project, simply compile and execute the Java file:
javac BankQueueSystem.java
java BankQueueSystem
