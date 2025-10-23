package Unidad01.Actividad;

public class Productos {
    private String nombre;
    private double precio;
    private int cantidad;

    public Productos(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int unidades) {
        if (unidades <= cantidad) {
            cantidad -= unidades;
            System.out.println(unidades + " unidades de " + nombre + " vendidas.");
        } else {
            System.out.println("No hay suficiente stock de " + nombre + " Solo quedan " + cantidad + " unidades.");
        }
    }

    public void reabastecer(int unidades) {
        cantidad += unidades;
        System.out.println(unidades + " unidad(es) de " + nombre + " agregadas al stock.");
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Cantidad: " + cantidad);
    }
}

