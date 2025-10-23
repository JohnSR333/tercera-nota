package Unidad01.Actividad05.utils;

public class Student {
    private String nombre;
    private double promedio;

    public Student(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }
}
