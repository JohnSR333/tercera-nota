package Unidad04.Actividad1;

import Unidad04.Actividad1.utils.Direccion;
import Unidad04.Actividad1.utils.Gerente;
import Unidad04.Actividad1.utils.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Direccion d1 = new Direccion("Bogotá", "Calle 45");
        Direccion d2 = new Direccion("Ocaña", "Calle 10");

        Gerente g1 = new Gerente("Laura", 4000, d1, 1200);
        Vendedor v1 = new Vendedor("Carlos", 2500, d2, 15000, 0.10);

        System.out.println("=====EMPLEADOS=====");
        g1.mostrarInfo();
        v1.mostrarInfo();
    }
}

