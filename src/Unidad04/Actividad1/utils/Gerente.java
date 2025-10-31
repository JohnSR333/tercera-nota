package Unidad04.Actividad1.utils;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, Direccion direccion, double bono){
        super(nombre, salarioBase, direccion);
        this.bono = bono;
    }

    @Override
    public double calcularPago(){
        return salarioBase + bono;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Gerente: " + nombre + " | Salario total: $" + calcularPago());
    }
}

