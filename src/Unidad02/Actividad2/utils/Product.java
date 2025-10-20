package Unidad02.Actividad2.utils;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Product: " + name + ", Price: $" + price;
    }
}

