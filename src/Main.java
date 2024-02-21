import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClothingStore store = new ClothingStore();
        Cashier cashier = new Cashier(store);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available items in inventory:");
        for (ClothingItem item : store.getInventory()) {
            System.out.println(item);
        }

        System.out.print("\nEnter customer name: ");
        String customerName = scanner.nextLine();

        String choice;
        do {
            System.out.print("Enter item choice (or 'done' to finish): ");
            choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("done")) {
                System.out.print("Enter size (S, M, L, XL): ");
                String size = scanner.nextLine().toUpperCase();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                switch (choice.toLowerCase()) {
                    case "shirt":
                        cashier.addToCart("Shirt", size, quantity);
                        break;
                    case "pants":
                        cashier.addToCart("Pants", size, quantity);
                        break;
                    case "dress":
                        cashier.addToCart("Dress", size, quantity);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } while (!choice.equalsIgnoreCase("done"));

        cashier.generateBill(customerName);
        scanner.close();
    }
}