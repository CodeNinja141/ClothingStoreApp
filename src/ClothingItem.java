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

    @Override
    public String toString() {
        return String.format("%s - Size: %s, Price: $%.2f", name, size, price);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}