/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

class Jirafa {
    // Atributos de clase (static)
    public static String especie = "Giraffa camelopardalis";
    
    // Atributos de instancia
    public String nombre;
    public int edad;
    public double altura; // en metros
    public double peso;   // en kg
    public String colorManchas;
    
    // Constructor simple (sin parámetros)
    public Jirafa() {
        this.nombre = "";
        this.edad = 0;
        this.altura = 0.0;
        this.peso = 0.0;
        this.colorManchas = "marron";
    }
    
    // Métodos
    public void comer() {
        System.out.println(this.nombre + " esta comiendo hojas de acacia desde las copas de los arboles");
    }
    
    public void caminar() {
        System.out.println(this.nombre + " camina elegantemente con sus largas patas");
    }
    
    public void dormir() {
        System.out.println(this.nombre + " duerme de pie, como hacen las jirafas");
    }
}