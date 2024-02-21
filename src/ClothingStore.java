import java.util.ArrayList;
import java.util.List;

class ClothingStore {
    private final List<ClothingItem> inventory;

    public ClothingStore() {
        inventory = new ArrayList<>();
        // Adding some sample clothing items to the inventory
        inventory.add(new ClothingItem("Shirt", 25.99, "M"));
        inventory.add(new ClothingItem("Shirt", 25.99, "L"));
        inventory.add(new ClothingItem("Shirt", 25.99, "XL"));
        inventory.add(new ClothingItem("Pants", 35.99, "S"));
        inventory.add(new ClothingItem("Pants", 35.99, "M"));
        inventory.add(new ClothingItem("Pants", 35.99, "L"));
        inventory.add(new ClothingItem("Dress", 45.99, "S"));
        inventory.add(new ClothingItem("Dress", 45.99, "M"));
        inventory.add(new ClothingItem("Dress", 45.99, "L"));
        // Add more items as needed
    }

    public ClothingItem getItem(String itemName, String size) {
        for (ClothingItem item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName) && item.getSize().equalsIgnoreCase(size)) {
                return item;
            }
        }
        return null;
    }

    public List<ClothingItem> getInventory() {
        return inventory;
    }
}