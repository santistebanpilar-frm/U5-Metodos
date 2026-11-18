/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto(1, "Teclado", 15000);
        Producto p2 = new Producto(2, "Mouse", 8000);
        Producto p3 = new Producto(3, "Monitor", 120000);
        Producto p4 = new Producto(1, "Teclado", 25000);

        //Evitar duplicados
        if (!productos.contains(p1)) {
            productos.add(p1);
        }

        if (!productos.contains(p2)) {
            productos.add(p2);
        }

        if (!productos.contains(p3)) {
            productos.add(p3);
        }

        if (!productos.contains(p4)) {
            productos.add(p4);
        } else {
            System.out.println("El producto ya existe: " + p4.nombre);
        }

        //Imprimir lista
        System.out.println("\nLista de productos:");
        System.out.println(productos);
        
    }
}
