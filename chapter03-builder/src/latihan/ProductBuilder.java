package latihan;

// ProductBuilder.java
public class ProductBuilder {
    private String name;
    private double price;
    private String description;
    private int stock;

    public ProductBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder price(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder description(String description) {
        this.description = description;
        return this;
    }

    public ProductBuilder stock(int stock) {
        this.stock = stock;
        return this;
    }

    public Product build() {
        return new Product(name, price, description, stock);
    }
}