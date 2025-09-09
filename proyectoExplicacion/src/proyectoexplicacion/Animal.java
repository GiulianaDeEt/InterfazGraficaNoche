/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE PADRE - Animal (generalización)
class Animal {
    // Atributos comunes a todos los animales
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String especie;
    
    // Constructor de la clase padre
    public Animal(String nombre, int edad, double peso, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }
    
    // Métodos comunes
    public void dormir() {
        System.out.println(nombre + " esta durmiendo...");
    }
    
    public void respirar() {
        System.out.println(nombre + " esta respirando");
    }
    
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }
    
    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + " | Especie: " + especie + 
                          " | Edad: " + edad + " anios | Peso: " + peso + " kg");
    }
}
