package Semana02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto.newTienda producto = new Producto.newTienda();

        System.out.println("=== Registro del Producto ===");
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Cantidad inicial en stock: ");
        int cantidad = sc.nextInt();


        producto.registrar(nombre, precio, cantidad);


        producto.mostrarProducto();

 
        System.out.print("¿Cuántas unidades deseas vender?: ");
        int cantidadVenta = sc.nextInt();
        producto.vender(cantidadVenta);
        producto.mostrarProducto();


        System.out.print("¿Cuántas unidades deseas agregar al stock?: ");
        int cantidadAgregar = sc.nextInt();
        producto.agregarStock(cantidadAgregar);
        producto.mostrarProducto();

        sc.close();
    }
}
