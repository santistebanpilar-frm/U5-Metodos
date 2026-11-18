/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_5;

import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Main {public static void main(String[] args) {
        
     HashSet<Producto> productos = new HashSet<>();

        //Crear productos
        Producto p1 = new Producto(1, "Teclado", 15000);
        Producto p2 = new Producto(2, "Mouse", 8000);
        Producto p3 = new Producto(3, "Monitor", 120000);
        Producto p4 = new Producto(1, "Teclado Gamer", 25000);
        Producto p5 = new Producto(2, "Mouse Inalambrico", 12000);

        //Agregar productos al HashSet
        System.out.println("Agregando productos:");

        System.out.println("Teclado: " + productos.add(p1));
        System.out.println("Mouse: " + productos.add(p2));
        System.out.println("Monitor: " + productos.add(p3));
        System.out.println("Teclado duplicado: " + productos.add(p4));
        System.out.println("Mouse duplicado: " + productos.add(p5));

        //Mostrar la cantidad de productos
        System.out.println("\nCantidad de productos: " + productos.size());

        //Imprimir productos
        System.out.println("\nLista de productos:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    
    }
    
}
