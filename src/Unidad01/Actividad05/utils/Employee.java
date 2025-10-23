package Unidad01.Actividad05.utils;

public class Employee {
    String role;

    public Employee(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void showResponsibilities() {
        switch (role) {
            case "manager":
                System.out.println("Maneja el equipo");
                break;
            case "developer":
                System.out.println("Programa y textea");
                break;
            case "designer":
                System.out.println("Diseña ui/ux");
                break;
            default:
                System.out.println("No conocido");
        }
    }
}
