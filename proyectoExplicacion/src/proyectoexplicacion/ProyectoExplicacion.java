/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexplicacion;

/*
ZOOLÓGICO VIRTUAL - Parte 1: Clases Básicas
Conceptos: Clases, atributos, métodos básicos, constructores simples
*/

public class ProyectoExplicacion {
    public static void main(String[] args) {
        // Crear instancias
        Jirafa miJirafa = new Jirafa();
        miJirafa.nombre = "Manchitas";
        miJirafa.edad = 5;
        miJirafa.altura = 4.5;
        
        Elefante miElefante = new Elefante();
        miElefante.nombre = "Dumbo";
        miElefante.edad = 12;
        miElefante.peso = 4000.0;
        
        Puma miPuma = new Puma();
        miPuma.nombre = "Sombra";
        miPuma.edad = 3;
        miPuma.velocidadMaxima = 80.0;
        
        // Usar los métodos
        System.out.println("=== ACTIVIDADES EN EL ZOOLOGICO ===");
        miJirafa.comer();
        miJirafa.caminar();
        
        System.out.println();
        miElefante.comer();
        miElefante.duchar();
        
        System.out.println();
        miPuma.cazar();
        miPuma.saltar();
        
        System.out.println();
        System.out.println("Informacion: " + miJirafa.nombre + " es un " + Jirafa.especie + " de " + miJirafa.edad + " anios");
        System.out.println("Informacion: " + miElefante.nombre + " es un " + Elefante.especie + " de " + miElefante.edad + " anios");
        System.out.println("Informacion: " + miPuma.nombre + " es un " + Puma.especie + " de " + miPuma.edad + " anios");
    
    }
}