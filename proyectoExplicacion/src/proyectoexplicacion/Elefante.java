/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

class Elefante {
    public static String especie = "Loxodonta africana";
    
    public String nombre;
    public int edad;
    public double peso;
    public double longitudTrompa; // en metros
    public boolean tieneColmillos;
    
    public Elefante() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
        this.longitudTrompa = 0.0;
        this.tieneColmillos = true;
    }
    
    public void comer() {
        System.out.println(this.nombre + " usa su trompa para agarrar hierba y frutas");
    }
    
    public void caminar() {
        System.out.println(this.nombre + " camina pesadamente haciendo temblar el suelo");
    }
    
    public void duchar() {
        System.out.println(this.nombre + " se ducha tirandose agua con su trompa");
    }
}
