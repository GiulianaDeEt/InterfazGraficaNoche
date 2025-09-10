/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexplicacion;

/**
 *
 * @author giuly
 */
public class ProyectoExplicacion2Herencia {

    public static void main(String[] args) {
        // Crear animales usando los nuevos constructores
        Jirafa manchitas = new Jirafa("Manchitas", 5, 800.0, 4.5, "marron");
        Elefante dumbo = new Elefante("Dumbo", 12, 4000.0, 1.8, true);
        Puma sombra = new Puma("Sombra", 3, 65.0, 80.0, 50.0);
        Pinguino pingui = new Pinguino("Bartolo", 2, 4.5, 0.7, 8.0);
        
        System.out.println("=== INFORMACION DE LOS ANIMALES ===");
        manchitas.mostrarInfo(); // Método heredado
        dumbo.mostrarInfo();     // Método heredado
        sombra.mostrarInfo();    // Método heredado
        pingui.mostrarInfo();    // Método heredado
        
        System.out.println("=== COMPORTAMIENTOS COMUNES ===");
        manchitas.respirar(); // Método heredado
        dumbo.dormir();       // Método sobrescrito
        sombra.respirar();    // Método heredado
        pingui.dormir();      // Método heredado
        
        System.out.println("=== COMPORTAMIENTOS ESPECIFICOS ===");
        manchitas.estirarCuello();
        manchitas.comer(); // Método sobrescrito
        
        dumbo.usarTrompa();
        dumbo.duchar();
        
        sombra.cazar();
        sombra.correr();
        
        pingui.nadar();
        pingui.deslizar();
        
        System.out.println("=== INTERACCIONES ENTRE ANIMALES ===");
        dumbo.ducharA(manchitas);  // El elefante ducha a la jirafa
        dumbo.ducharA(sombra);     // El elefante ducha al puma
        dumbo.ducharA(pingui);     // El elefante ducha al pingüino
        
        System.out.println("=== DEMOSTRACION DE POLIMORFISMO BASICO ===");
        // Todos son animales, pero cada uno come diferente
        Animal[] animales = {manchitas, dumbo, sombra, pingui};
        
        System.out.println("Hora de comer:");
        for (Animal animal : animales) {
            animal.comer(); // Se ejecuta el método sobrescrito de cada clase
        }
    }
    
}
