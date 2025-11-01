package Unidad04.ActividadClaseVirtual.app;

import Unidad04.ActividadClaseVirtual.domain.Curso;
import Unidad04.ActividadClaseVirtual.domain.Estudiante;
import Unidad04.ActividadClaseVirtual.domain.Profesor;
import Unidad04.ActividadClaseVirtual.domain.Proyecto;

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("P-01", "Yisus", "Ing. Sistemas");
        Estudiante estudiante1 = new Estudiante("E-01", "Paula", "Ing. Sistemas");
        Estudiante estudiante2 = new Estudiante("E-02", "Lucho", "Ing. Mecanica");

        Curso programacion = new Curso("19338ID", "Programacion II");
        profesor.dictar(programacion);

        // COMPOSICIÓN
        programacion.agregarUnidad("HERENCIA", 2);
        programacion.agregarUnidad("POLIMORFISMO", 4);

        // AGREGACIÓN
        programacion.inscribir(estudiante1);
        programacion.inscribir(estudiante2);

        // ASOCIACIÓN
        Proyecto proyecto = new Proyecto("Examen final", estudiante2);
        profesor.asesorar(proyecto);

        System.out.println(programacion);
    }
}

