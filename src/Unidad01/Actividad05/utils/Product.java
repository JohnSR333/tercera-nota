package Unidad01.Actividad05.utils;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Producto: " + name + ", Precio: " + price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
