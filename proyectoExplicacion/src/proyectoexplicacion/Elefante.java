/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion3.gettersetter;
class Elefante extends Animal {
    private double longitudTrompa;
    private boolean tieneColmillos;
    
    public Elefante(String nombre, int edad, double peso, double longitudTrompa, boolean tieneColmillos) {
        super(nombre, edad, peso, "Loxodonta africana");
        this.setLongitudTrompa(longitudTrompa);
        this.tieneColmillos = tieneColmillos;
    }
    
    // Getters
    public double getLongitudTrompa() {
        return longitudTrompa;
    }
    
    public boolean isTieneColmillos() { // Convención: boolean usa "is"
        return tieneColmillos;
    }
    
    // Setters
    public void setLongitudTrompa(double longitudTrompa) {
        if (longitudTrompa >= 0.5 && longitudTrompa <= 3.0) {
            this.longitudTrompa = longitudTrompa;
        } else {
            System.out.println("Error: La trompa debe medir entre 0.5 y 3 metros");
            this.longitudTrompa = 1.5; // longitud promedio
        }
    }
    
    public void setTieneColmillos(boolean tieneColmillos) {
        this.tieneColmillos = tieneColmillos;
    }
    
    public void usarTrompa() {
        System.out.println(getNombre() + " usa su trompa de " + longitudTrompa + " metros");
    }
    
    public void duchar() {
        System.out.println(getNombre() + " se ducha rociándose agua con su trompa");
    }
    
    @Override
    public void comer() {
        System.out.println(getNombre() + " usa su trompa de " + longitudTrompa + "m para agarrar hierba y frutas");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " barita fuertemente: 'PFFFRRRR!'");
    }
    
    public void mostrarDetalles() {
        String colmillos = tieneColmillos ? "con colmillos" : "sin colmillos";
        System.out.println(getNombre() + " - Trompa: " + longitudTrompa + "m, " + colmillos);
    }
}