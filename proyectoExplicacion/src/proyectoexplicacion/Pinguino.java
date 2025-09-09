/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

class Pinguino {
    public static String especie = "Spheniscus humboldti";
    
    public String nombre;
    public int edad;
    public double altura; // en metros
    public boolean puedeVolar;
    public double velocidadNado; // km/h
    
    public Pinguino() {
        this.nombre = "";
        this.edad = 0;
        this.altura = 0.0;
        this.puedeVolar = false;
        this.velocidadNado = 0.0;
    }
    
    public void comer() {
        System.out.println(this.nombre + " come pescado fresco");
    }
    
    public void nadar() {
        System.out.println(this.nombre + " nada rápidamente bajo el agua");
    }
    
    public void deslizar() {
        System.out.println(this.nombre + " se desliza sobre su barriga en el hielo");
    }
}
