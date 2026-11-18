/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Curso {
     String nombre;
    ArrayList<Estudiante> listaDeEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso: " + nombre +
                "\nCantidad de alumnos: " + listaDeEstudiantes.size() +
                "\nLista de estudiantes:\n" + listaDeEstudiantes;
    }
}
