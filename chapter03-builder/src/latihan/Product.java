package latihan;

public class Product {
    private String name;
    private double price;
    private String description;
    private int stock;

    public Product(String name, double price, String description, int stock) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product Details\n" +
                "-----------\n" +
                "Name: " + name + "\n" +
                "Price: $" + price + "\n" +
                "Description: " + description + "\n" +
                "Stock: " + stock + " units";
    }
}