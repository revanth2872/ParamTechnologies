public class ShoppingWebsite {
    private String name;
    private String url;
    private List<Product> products;

    public ShoppingWebsite(String name, String url) {
        this.name = name;
        this.url = url;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public static void main(String[] args) {
        // Create an instance of the shopping website
        ShoppingWebsite website = new ShoppingWebsite("My Shopping Site", "https://www.myshoppingsite.com");

        // Create some products
        Product product1 = new Product("Product 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 49.99);
        Product product2 = new Product("Product 2", "Ut interdum massa vitae lectus rutrum, vitae ultrices odio semper.", 29.99);

        // Add products to the website
        website.addProduct(product1);
        website.addProduct(product2);

        // Get the list of products from the website
        List<Product> products = website.getProducts();

        // Display the products
        for (Product product : products) {
            System.out.println("Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: $" + product.getPrice());
            System.out.println();
        }
    }
}

class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
