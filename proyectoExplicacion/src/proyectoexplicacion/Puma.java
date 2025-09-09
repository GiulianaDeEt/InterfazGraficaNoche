/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE HIJA - hereda de Animal
class Puma extends Animal {
    private double velocidadMaxima;
    private double territorioKm2;
    
    public Puma(String nombre, int edad, double peso, double velocidadMaxima, double territorioKm2) {
        super(nombre, edad, peso, "Puma concolor");
        this.velocidadMaxima = velocidadMaxima;
        this.territorioKm2 = territorioKm2;
    }
    
    public void cazar() {
        System.out.println(nombre + " acecha sigilosamente a su presa");
    }
    
    public void saltar() {
        System.out.println(nombre + " salta agilmente entre las rocas");
    }
    
    public void correr() {
        System.out.println(nombre + " corre a " + velocidadMaxima + " km/h");
    }
    
    @Override
    public void comer() {
        System.out.println(nombre + " devora su presa con sus poderosas mandibulas");
    }
    
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
}