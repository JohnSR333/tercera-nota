package Unidad01.Actividad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto 1: ");
        String nombre1 = sc.nextLine();
        System.out.print("Ingrese el precio del producto 1: ");
        double precio1 = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto 1: ");
        int cantidad1 = sc.nextInt();
        sc.nextLine(); 

        Productos p1 = new Productos(nombre1, precio1, cantidad1);

        System.out.print("Ingrese el nombre del producto 2: ");
        String nombre2 = sc.nextLine();
        System.out.print("Ingrese el precio del producto 2: ");
        double precio2 = sc.nextDouble();
        System.out.print("Ingrese la cantidad del producto 2: ");
        int cantidad2 = sc.nextInt();

        Productos p2 = new Productos(nombre2, precio2, cantidad2);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Vender producto");
            System.out.println("3. Reabastecer producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    p1.mostrarProducto();
                    p2.mostrarProducto();
                    break;
                case 2:
                    System.out.print("Que producto quiere vender (1 o 2): ");
                    int prodVender = sc.nextInt();
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantVender = sc.nextInt();
                    if (prodVender == 1) {
                        p1.vender(cantVender);
                    } else if (prodVender == 2) {
                        p2.vender(cantVender);
                    } else {
                        System.out.println("Productos invalido.");
                    }
                    break;
                case 3:
                    System.out.print("Que producto quiere reabastecer (1 o 2): ");
                    int prodReab = sc.nextInt();
                    System.out.print("Ingrese la cantidad a reabastecer: ");
                    int cantReab = sc.nextInt();
                    if (prodReab == 1) {
                        p1.reabastecer(cantReab);
                    } else if (prodReab == 2) {
                        p2.reabastecer(cantReab);
                    } else {
                        System.out.println("Productos invalido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

