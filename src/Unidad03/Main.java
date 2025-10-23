package Unidad03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear una lista con algunos libros
        List<Book> books = new ArrayList<>();
        books.add(new Book("El Hobbit", "J.R.R. Tolkien", 39.9));
        books.add(new Book("1984", "George Orwell", 29.5));
        books.add(new Book("Matar a un ruiseñor", "Harper Lee", 35.0));

        // Crear el manejador para guardar y leer
        BookFileHandler handler = new BookFileHandler();

        // Guardar en el archivo
        handler.saveBooks(books);

        // Leer desde el archivo
        handler.readBooks();
    }
}


