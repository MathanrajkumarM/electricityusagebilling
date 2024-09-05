import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Customer");
            System.out.println("2. Add Usage");
            System.out.println("3. Calculate Bill");
            System.out.println("4. View Customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID: ");
                    String customerId = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer address: ");
                    String address = scanner.nextLine();
                    billingSystem.addCustomer(customerId, name, address);
                    System.out.println("Customer added successfully!");
                    break;

                case 2:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    System.out.print("Enter units consumed: ");
                    double unitsConsumed = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    billingSystem.addUsage(customerId, unitsConsumed);
                    System.out.println("Usage added successfully!");
                    break;

                case 3:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextLine();
                    double billAmount = billingSystem.calculateBill(customerId);
                    if (billAmount == 0) {
                        System.out.println("No usage record found for customer ID: " + customerId);
                    } else {
                        System.out.println("Bill amount for customer ID " + "Rs " + customerId + billAmount +);
                    }
                    break;

                case 4:
                    System.out.println("Customers:");
                    for (Customer customer : billingSystem.getCustomers()) {
                        System.out.println(customer);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
