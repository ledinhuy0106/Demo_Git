package model;

public class Product {
    private int id;
    private double price;
    private String name;
    private int quantity;
    private Category category;

    public Product(int id, double price, String name, int quantity, Category category) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }


    public Product(double price, String name, int quantity, Category category) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
