package Unidad03.Actividad;

public class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Mostrar datos del libro
    public String toString() {
        return "Título: " + title + ", Autor: " + author + ", Precio: $" + price;
    }
}


