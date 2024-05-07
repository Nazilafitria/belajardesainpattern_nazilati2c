package latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Product menggunakan Builder Pattern
        Product product1 = new ProductBuilder()
                .name("Smartphone")
                .price(500.0)
                .description("High-end smartphone with advanced features")
                .stock(100)
                .build();

        System.out.println(product1.toString());

        // Membuat objek Product lain dengan konfigurasi berbeda
        Product product2 = new ProductBuilder()
                .name("Laptop")
                .price(1200.0)
                .stock(50)
                .build();

        System.out.println(product2.toString());
    }
}