/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selva;

/**
 *
 * @author Cele
 */
public class SelvaMain {
    public static void main(String[] args) {

        // Creamos los animales de la selva
        Jaguar jaguar = new Jaguar("Pancho", 5, 80.0);
        Jabali jabali = new Jabali("Toto", 4, 90.0);
       

        System.out.println("=== ESTADO INICIAL ===");
        jaguar.mostrarInfo();
        jabali.mostrarInfo();
        
        System.out.println();

        System.out.println("=== LOS ANIMALES EXPLORAN LA SELVA ===");
        jaguar.explorarSelva();
      
        jabali.explorarSelva();
        System.out.println();

        System.out.println("=== BEBEN AGUA EN EL RIO ===");
      
        jabali.beberEnRio();
        jaguar.beberEnRio();
        System.out.println();

        System.out.println("=== COMUNICACION EN LA SELVA ===");
     
        jaguar.hacerSonido();
        System.out.println();

        System.out.println("=== EL JAGUAR INTENTA CAZAR AL JABALI ===");
        jaguar.cazar(jabali);   // usa el método específico cazar(Jabali)
        System.out.println();

        System.out.println("=== ESTADO FINAL DE LOS ANIMALES ===");
        jaguar.mostrarInfo();
        jabali.mostrarInfo();

    }
}
