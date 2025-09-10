/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE HIJA - hereda de Animal
class Elefante extends Animal {
    private double longitudTrompa;
    private boolean tieneColmillos;
    
    public Elefante(String nombre, int edad, double peso, double longitudTrompa, boolean tieneColmillos) {
        super(nombre, edad, peso, "Loxodonta africana");
        this.longitudTrompa = longitudTrompa;
        this.tieneColmillos = tieneColmillos;
    }
    
    public void usarTrompa() {
        System.out.println(nombre + " usa su trompa de " + longitudTrompa + " metros");
    }
    
    public void duchar() {
        System.out.println(nombre + " se ducha tirandose agua con su trompa");
    }
    
    public void ducharA(Animal otro) {
        System.out.println(nombre + " tira agua sobre " + otro.nombre + " con su trompa");
    }
    
    @Override
    public void comer() {
        System.out.println(nombre + " usa su trompa para agarrar hierba y frutas");
    }
    
    public double getLongitudTrompa() {
        return longitudTrompa;
    }
    
}

