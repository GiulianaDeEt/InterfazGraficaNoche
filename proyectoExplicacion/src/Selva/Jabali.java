/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Selva;

import proyectoexplicacion.Animal;

/**
 *
 * @author Cele
 */
public class Jabali extends Animal implements HabitatSelva {

    public Jabali(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Jabali");
    }

    private boolean tieneEnergia(int costo) {
        if (energia < costo) {
            System.out.println(nombre + " esta demasiado cansado. Energia: " + energia);
            return false;
        }
        return true;
    }
    
    private void gastarEnergia(int costo) {
        energia -= costo;
        if (energia < 0) energia = 0;
    }

    // ===== Métodos abstractos de Animal =====
    @Override
    public void comer() {
        if (!tieneEnergia(4)) return;
        System.out.println(nombre + " esta comiendo raices y frutos del suelo.");
        gastarEnergia(4);
        energia = Math.min(100, energia + 6);
    }

    @Override
    public void hacerSonido() {
        if (!tieneEnergia(2)) return;
        System.out.println(nombre + " gruñe fuerte.");
        gastarEnergia(2);
    }

    @Override
    public void moverse() {
        if (!tieneEnergia(5)) return;
        System.out.println(nombre + " corre pesadamente entre la vegetacion.");
        gastarEnergia(5);
    }

    @Override
    public String getTipoHabitat() {
        return "Selva";
    }

    // ===== Métodos de HabitatSelva =====
    @Override
    public void explorarSelva() {
        if (!tieneEnergia(3)) return;
        System.out.println(nombre + " explora la selva buscando comida.");
        gastarEnergia(3);
}
    @Override
    public void beberEnRio() {
        if (!tieneEnergia(2)) return;
        System.out.println(nombre + " toma agua del rio.");
        gastarEnergia(2);
        energia = Math.min(100, energia + 4);
    }

    @Override
    public void refugiarseDeLluvia() {
        if (!tieneEnergia(1)) return;
        System.out.println(nombre + " se refugia bajo la maleza para no mojarse.");
        gastarEnergia(1);
    }
}
