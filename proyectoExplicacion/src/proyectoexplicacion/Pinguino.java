/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE HIJA - hereda de Animal
class Pinguino extends Animal {
    private double altura;
    private boolean puedeVolar;
    private double velocidadNado;
    
    public Pinguino(String nombre, int edad, double peso, double altura, double velocidadNado) {
        super(nombre, edad, peso, "Spheniscus humboldti");
        this.altura = altura;
        this.puedeVolar = false; // Los pingüinos no vuelan
        this.velocidadNado = velocidadNado;
    }
    
    public void nadar() {
        System.out.println(nombre + " nada rapidamente a " + velocidadNado + " km/h bajo el agua");
    }
    
    public void deslizar() {
        System.out.println(nombre + " se desliza sobre su barriga en el hielo");
    }
    /**
    @Override
    public void comer() {
        System.out.println(nombre + " come pescado fresco");
    }
    
    public double getVelocidadNado() {
        return velocidadNado;
    }
    * */
}
