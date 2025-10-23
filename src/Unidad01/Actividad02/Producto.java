package Unidad01.Actividad02;

public class Producto {
    public static class newTienda {
        String nombre;
        double precio;
        int cantidad;

        void registrar(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        void vender(int cantidadVendida) {
            if (cantidadVendida <= cantidad) {
                cantidad -= cantidadVendida;
                System.out.println(" Vendidas " + cantidadVendida + " unidades de " + nombre +
                                   " Stock restante: " + cantidad);
            } else {
                System.out.println(" Stock insuficiente. Solo hay " + cantidad + " unidades disponibles.");
            }
        }

        void agregarStock(int cantidadNueva) {
            cantidad += cantidadNueva;
            System.out.println(" Se agregaron " + cantidadNueva + " unidades. Stock total: " + cantidad);
        }

        void mostrarProducto() {
            System.out.println(" Producto: " + nombre +
                               " |  Precio: $" + String.format("%.2f", precio) +
                               " |  Cantidad: " + cantidad);
        }
    }
}

