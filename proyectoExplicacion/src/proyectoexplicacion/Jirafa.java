/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion3.gettersetter;

class Jirafa extends Animal {
    // Atributos privados específicos
    private double altura;
    private String colorManchas;
    
    public Jirafa(String nombre, int edad, double peso, double altura, String colorManchas) {
        super(nombre, edad, peso, "Giraffa camelopardalis");
        this.setAltura(altura);
        this.setColorManchas(colorManchas);
    }
    
    // Getters específicos
    public double getAltura() {
        return altura;
    }
    
    public String getColorManchas() {
        return colorManchas;
    }
    
    // Setters con validaciones específicas
    public void setAltura(double altura) {
        if (altura >= 1.0 && altura <= 6.0) {
            this.altura = altura;
        } else {
            System.out.println("Error: La altura de una jirafa debe estar entre 1 y 6 metros");
            this.altura = 4.0; // altura promedio
        }
    }
    
    public void setColorManchas(String colorManchas) {
        if (colorManchas != null && !colorManchas.trim().isEmpty()) {
            this.colorManchas = colorManchas.toLowerCase().trim();
        } else {
            this.colorManchas = "marron"; // color por defecto
        }
    }
    
    public void estirarCuello() {
        System.out.println(getNombre() + " estira su cuello de " + altura + " metros para alcanzar las hojas mas altas");
    }
    
    @Override
    public void comer() {
        System.out.println(getNombre() + " esta comiendo hojas de acacia desde " + altura + " metros de altura");
    }
    
    @Override
    public void dormir() {
        System.out.println(getNombre() + " duerme de pie, como hacen las jirafas de " + altura + " metros");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " es muda");
    }
    
    // Método que demuestra uso de getters
    public void mostrarDetalles() {
        System.out.println("🦒 " + getNombre() + " - Altura: " + altura + "m, Manchas: " + colorManchas);
    }
}
