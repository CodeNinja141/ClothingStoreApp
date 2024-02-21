import java.util.HashMap;
import java.util.Map;

class Cashier {
    private final ClothingStore store;
    private Map<ClothingItem, Integer> cart;
    private double totalPrice;

    public Cashier(ClothingStore store) {
        this.store = store;
        cart = new HashMap<>();
        totalPrice = 0.0;
    }

    public void addToCart(String itemName, String size, int quantity) {
        ClothingItem item = store.getItem(itemName, size);
        if (item != null) {
            cart.put(item, quantity);
            totalPrice += item.getPrice() * quantity;
        } else {
            System.out.println("Item not found in the inventory.");
        }
    }

    public void generateBill(String customerName) {
        System.out.println("------ Invoice ------");
        System.out.println("Customer: " + customerName);
        for (Map.Entry<ClothingItem, Integer> entry : cart.entrySet()) {
            ClothingItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(item + " x" + quantity);
        }
        System.out.println("---------------------");
        System.out.printf("Total: $%.2f\n", totalPrice);
    }
}
