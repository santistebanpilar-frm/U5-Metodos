/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_3;

/**
 *
 * @author Usuario
 */
public class Main {public static void main(String[] args) {
        // Crear estudiantes
        Estudiante e1 = new Estudiante("Juan", 20, "Ingenieria");
        Estudiante e2 = new Estudiante("Maria", 22, "Diseno Grafico");
        Estudiante e3 = new Estudiante("Pedro", 21, "Medicina");

        Estudiante e4 = new Estudiante("Lucia", 23, "Programacion");
        Estudiante e5 = new Estudiante("Carlos", 20, "Informatica");

        // Crear cursos
        Curso curso1 = new Curso("Estructuras de Datos");
        Curso curso2 = new Curso("Programacion Java");

        // Agregar estudiantes a los cursos
        curso1.agregarEstudiante(e1);
        curso1.agregarEstudiante(e2);
        curso1.agregarEstudiante(e3);

        curso2.agregarEstudiante(e4);
        curso2.agregarEstudiante(e5);

        // Imprimir cursos
        System.out.println(curso1);
        System.out.println();

        System.out.println(curso2);
    }
    
}
