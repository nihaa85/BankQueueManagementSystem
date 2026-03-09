
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankQueueSystem {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bank Queue Management System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    queue.add(name);
                    System.out.println(name + " added to the queue.");
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
