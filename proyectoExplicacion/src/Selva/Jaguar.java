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
public class Jaguar extends Animal implements HabitatSelva {

    public Jaguar(String nombre, int edad, double peso) {
        super(nombre, edad, peso, "Jaguar");
    }

    private boolean tieneEnergia(int costo) {
        if (energia < costo) {
            System.out.println(nombre + " no tiene suficiente energia para hacer esto. Energia actual: " + energia);
            return false;
        }
        return true;
    }

    private void gastarEnergia(int costo) {
        energia -= costo;
        if (energia < 0) {
            energia = 0;
        }
    }

    // ===== Métodos abstractos de Animal =====
    @Override
    public void comer() {
        if (!tieneEnergia(5)) {
            return;
        }
        System.out.println(nombre + " esta comiendo su presa en la selva.");
        gastarEnergia(5);
    }

    @Override
    public void hacerSonido() {
        if (!tieneEnergia(3)) {
            return;
        }
        System.out.println(nombre + " ruge con mucha fuerza.");
        gastarEnergia(3);
    }

    @Override
    public void moverse() {
        if (!tieneEnergia(8)) {
            return;
        }
        System.out.println(nombre + " se mueve sigilosamente entre los arboles.");
        gastarEnergia(8);
    }

    @Override
    public String getTipoHabitat() {
        return "Selva";
    }

    // ===== Métodos de HabitatSelva =====
    @Override
    public void explorarSelva() {
        if (!tieneEnergia(6)) {
            return;
        }
        System.out.println(nombre + " explora la selva buscando presas.");
        gastarEnergia(6);
    }

    @Override
    public void beberEnRio() {
        if (!tieneEnergia(2)) {
            return;
        }
        System.out.println(nombre + " bebe agua fresca del rio.");
        gastarEnergia(2);
        // Podés compensar un poco:
        energia = Math.min(100, energia + 4);
    }

    @Override
    public void refugiarseDeLluvia() {
        if (!tieneEnergia(1)) {
            return;
        }
        System.out.println(nombre + " se refugia bajo un arbol grande para no mojarse.");
        gastarEnergia(1);
    }

    public void cazar(Jabali jabali) {
        if (!tieneEnergia(20)) {
            return;
        }

        System.out.println(nombre + " se lanza a cazar al jabali " + jabali.getNombre());

        gastarEnergia(20);

        // Siempre lo atrapa
        if (this.peso > jabali.getPeso() / 2) {
            System.out.println("¡" + nombre + " logro atrapar al jabali " + jabali.getNombre() + "!");
            jabali.setEnergia(0); // el jabali queda sin energia
        } else {
            System.out.println(jabali.getNombre() + " logra escapar entre la maleza.");
        }
    }
}
