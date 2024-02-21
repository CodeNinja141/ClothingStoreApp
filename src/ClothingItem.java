class ClothingItem {
    private String name;
    private double price;
    private String size;

    public ClothingItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }


    public String toString() {
        return name + " - Size: " + size + ", Price: $" + price;
    }
    // This method belongs to object class, We are using it to return a string values of clothingItem Object.

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}