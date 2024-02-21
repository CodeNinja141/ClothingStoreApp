import java.util.ArrayList;
import java.util.List;

class ClothingStore {

    private final List<ClothingItem> inventory;
    // Use the List interface

    public ClothingStore() {
        inventory = new ArrayList<>();
        // Declare as ArrayList because of dynamic resizing.
        // If we need to move to a LinkedList in the future we can do it bcz we declare inventory using the List interface in java.

        inventory.add(new ClothingItem("Shirt", 25.99, "M"));
        inventory.add(new ClothingItem("Shirt", 25.99, "L"));
        inventory.add(new ClothingItem("Shirt", 25.99, "XL"));
        inventory.add(new ClothingItem("Pants", 35.99, "S"));
        inventory.add(new ClothingItem("Pants", 35.99, "M"));
        inventory.add(new ClothingItem("Pants", 35.99, "L"));
        inventory.add(new ClothingItem("Dress", 45.99, "S"));
        inventory.add(new ClothingItem("Dress", 45.99, "M"));
        inventory.add(new ClothingItem("Dress", 45.99, "L"));
        // Add more item If you need !
    }

    public ClothingItem getItem(String itemName, String size) {
        for (ClothingItem item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName) && item.getSize().equalsIgnoreCase(size)) {
                return item;
            }
        }
        return null;
    }
    // Check if the item is in the inventory then it is return.
    // if it is not return null.

    public List<ClothingItem> getInventory() {
        return inventory;
    }
}