package Unidad01.Actividad03;

public class Company {
    public static class newCompany {
    public String nombre;         
    protected String rol;         
    private double salario;       


    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor a 0");
        }
    }


    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double cantidad) {
        if (cantidad > 0) {
            salario += cantidad;
        } else {
            System.out.println("La cantidad para aumentar debe ser positiva");
        }
    }
    void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Rol: " + rol);
        System.out.println("Salario: " + salario);
        }
    }
}

