/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

class Puma extends Animal {
    private double velocidadMaxima;
    private double territorioKm2;
    
    public Puma(String nombre, int edad, double peso, double velocidadMaxima, double territorioKm2) {
        super(nombre, edad, peso, "Puma concolor");
        this.setVelocidadMaxima(velocidadMaxima);
        this.setTerritorioKm2(territorioKm2);
    }
    
    // Getters
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    
    public double getTerritorioKm2() {
        return territorioKm2;
    }
    
    // Setters
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima >= 30 && velocidadMaxima <= 100) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("Error: La velocidad debe estar entre 30 y 100 km/h");
            this.velocidadMaxima = 65.0; // velocidad promedio
        }
    }
    
    public void setTerritorioKm2(double territorioKm2) {
        if (territorioKm2 >= 10 && territorioKm2 <= 200) {
            this.territorioKm2 = territorioKm2;
        } else {
            System.out.println("Error: El territorio debe estar entre 10 y 200 km2");
            this.territorioKm2 = 50.0; // territorio promedio
        }
    }
    
    public void cazar() {
        System.out.println(getNombre() + " acecha sigilosamente en sus " + territorioKm2 + " km² de territorio");
    }
    
    public void correr() {
        System.out.println(getNombre() + " corre a " + velocidadMaxima + " km/h");
    }
    
    @Override
    public void comer() {
        System.out.println(getNombre() + " devora su presa con sus poderosas mandibulas");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " grunie amenazadoramente: '¡GRRRRR!'");
    }
    
    public void mostrarDetalles() {
        System.out.println(getNombre() + " - Velocidad: " + velocidadMaxima + " km/h, Territorio: " + territorioKm2 + " km2");
    }
}
