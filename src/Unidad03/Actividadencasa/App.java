package Unidad03.Actividadencasa;

import java.util.Scanner;
import Unidad03.Actividadencasa.models.Carro;
import Unidad03.Actividadencasa.models.Moto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro("Toyota", "Corolla", "Rojo", 4);
        Moto moto = new Moto("Yamaha", "R1", "Negra");

        int opcion;
        do {
            System.out.println("\n===== MENÚ VEHÍCULOS =====");
            System.out.println("1. Acelerar carro");
            System.out.println("2. Frenar carro");
            System.out.println("3. Abrir puerta del carro");
            System.out.println("4. Cerrar puerta del carro");
            System.out.println("5. Acelerar moto");
            System.out.println("6. Frenar moto");
            System.out.println("7. Hacer wheelie");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    carro.acelerar(20);
                    break;
                case 2:
                    carro.frenar(15);
                    break;
                case 3:
                    carro.abrirPuerta();
                    break;
                case 4:
                    carro.cerrarPuerta();
                    break;
                case 5:
                    moto.acelerar(25);
                    break;
                case 6:
                    moto.frenar(15);
                    break;
                case 7:
                    moto.wheelie();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}





