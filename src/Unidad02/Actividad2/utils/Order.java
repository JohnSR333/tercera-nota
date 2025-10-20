package Unidad02.Actividad2.utils;

import java.util.ArrayList;

public class Order {
    String date;
    double total;
    ArrayList<Product> products; 

    public Order(String date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.price;
    }

    public String getInfo() {
        return "Order date: " + date + ", Total: $" + total + ", Products: " + products.size();
    }
}

