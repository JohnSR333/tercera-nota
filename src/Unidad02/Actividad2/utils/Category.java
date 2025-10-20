package Unidad02.Actividad2.utils;

import java.util.ArrayList;

public class Category {
    String name;
    String description;
    ArrayList<Product> products;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public String getInfo() {
        return "Category: " + name + " (" + description + "), Total products: " + products.size();
    }
}

