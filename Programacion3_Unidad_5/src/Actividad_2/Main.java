/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad_2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Pepito", 22, "Ingenieria en Sistemas"));
        estudiantes.add(new Estudiante("Ivan", 20, "Diseno Grafico"));
        estudiantes.add(new Estudiante("Leadora", 24, "Medicina"));

        System.out.println(estudiantes);
        
    }
}
