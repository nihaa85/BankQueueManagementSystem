import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.InputMismatchException; // Import for error handling

public class BankQueueSystem {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Welcome to the Bank Queue Management System");

        do {
            System.out.println("\n--- Bank Queue Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Error Handling for non-integer input
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number (1-4).");
                sc.nextLine(); // Clear the invalid input from scanner
                continue; // Skip the rest of the loop and start over
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    // Validation to ensure name isn't empty
                    if (name.trim().isEmpty()) {
                        System.out.println("Customer name cannot be empty!");
                    } else {
                        queue.add(name);
                        System.out.println(name + " added to the queue.");
                    }
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("No customers in queue.");
                    } else {
                        System.out.println(queue.poll() + " is being served.");
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Customers in queue: " + queue);
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
