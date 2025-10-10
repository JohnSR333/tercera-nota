package Semana05;

import Semana05.utils.Student;
import Semana05.utils.Employee;
import Semana05.utils.Product;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Student
        Student s1 = new Student("Ana", 4.1);
        Student s2 = new Student("Frank", 2.9);
        System.out.println(s1.getNombre() + ": " + s1.getPromedio());
        System.out.println(s2.getNombre() + ": " + s2.getPromedio());

        // Employee
        Employee e1 = new Employee("manager");
        Employee e2 = new Employee("developer");
        Employee e3 = new Employee("designer");

        System.out.println("Rol: " + e1.getRole());
        e1.showResponsibilities();

        System.out.println("Rol: " + e2.getRole());
        e2.showResponsibilities();

        System.out.println("Rol: " + e3.getRole());
        e3.showResponsibilities();

        // Product
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500000));
        products.add(new Product("Mouse", 200000));
        products.add(new Product("Teclado", 400000));
        products.add(new Product("Monitor", 300000));
        products.add(new Product("Impresora", 200000));

        for (Product p : products) {
            p.showInfo();
        }
    }
}