package Semana03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Company.newCompany emp1 = new Company.newCompany();
        Company.newCompany emp2 = new Company.newCompany();

        System.out.println(" Registro del primer empleado ");
        System.out.print("Nombre: ");
        emp1.nombre = sc.nextLine();
        System.out.print("Rol: ");
        emp1.rol = sc.nextLine();
        System.out.print("Salario: ");
        double salario1 = sc.nextDouble();
        sc.nextLine(); 
        emp1.setSalario(salario1);

        System.out.println(" Registro del segundo empleado ");
        System.out.print("Nombre: ");
        emp2.nombre = sc.nextLine();
        System.out.print("Rol: ");
        emp2.rol = sc.nextLine();
        System.out.print("Salario: ");
        double salario2 = sc.nextDouble();
        emp2.setSalario(salario2);

        System.out.println(" Aumentar salario ");
        System.out.print("¿Cuánto desea aumentar el salario del primer empleado? ");
        double aumento1 = sc.nextDouble();
        emp1.aumentarSalario(aumento1);

        System.out.print("¿Cuánto desea aumentar el salario del segundo empleado? ");
        double aumento2 = sc.nextDouble();
        emp2.aumentarSalario(aumento2);

        System.out.println(" Información de los empleados ");
        emp1.mostrarEmpleado();
        emp2.mostrarEmpleado();

        sc.close();
    }
}
