package Unidad03.Actividad;

import java.io.*;
import java.util.*;

public class BookFileHandler {

    String fileName = "books.txt";

    // Guardar los libros en el archivo
    public void saveBooks(List<Book> books) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (Book book : books) {
                writer.write(book.title + "," + book.author + "," + book.price);
                writer.newLine();
            }
            System.out.println(" Libros guardados correctamente.");
        } catch (IOException e) {
            System.out.println(" Error al guardar los libros: " + e.getMessage());
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
            System.out.println("Operación finalizada (guardar).");
        }
    }

    // Leer los libros desde el archivo
    public void readBooks() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println(" Libros leídos desde el archivo:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String title = data[0];
                    String author = data[1];
                    double price = Double.parseDouble(data[2]);
                    Book book = new Book(title, author, price);
                    System.out.println(book);
                }
            }
        } catch (IOException e) {
            System.out.println(" Error al leer los libros: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
            System.out.println("Operación finalizada (leer).");
        }
    }
}


