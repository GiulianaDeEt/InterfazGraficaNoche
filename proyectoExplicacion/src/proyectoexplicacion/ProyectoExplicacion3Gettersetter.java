/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexplicacion3.gettersetter;

/**
 *
 * @author giuly
 */
public class ProyectoExplicacion3Gettersetter {
    public static void main(String[] args) {
        System.out.println("~ CREACION DE ANIMALES CON VALIDACIONES ~");
        
        // Crear animales con datos válidos
        Jirafa manchitas = new Jirafa("Manchitas", 5, 800.0, 4.5, "marron oscuro");
        Elefante dumbo = new Elefante("Dumbo", 12, 4000.0, 1.8, true);
        Puma sombra = new Puma("Sombra", 3, 65.0, 80.0, 50.0);
        
        System.out.println("~ INFORMACIPN INICIAL ~");
        manchitas.mostrarInfo();
        dumbo.mostrarInfo();
        sombra.mostrarInfo();
        
        System.out.println("~ DETALLES ESPECIFICOS ~");
        manchitas.mostrarDetalles();
        dumbo.mostrarDetalles();
        sombra.mostrarDetalles();
        
        System.out.println("~ DEMOSTRANDO VALIDACIONES (datos incorrectos) ~");
        
        // Intentar crear animal con datos inválidos
        Jirafa jirafaMala = new Jirafa("", -5, -100.0, 10.0, "");
        jirafaMala.mostrarInfo();
        
        System.out.println("~ MODIFICANDO DATOS CON SETTERS ~");
        
        // Cambios validos
        manchitas.cambiarPeso(850.0);
        manchitas.cumplirAnios();
        
        // Cambios invalidos
        System.out.println("Intentando cambios invalidos:");
        dumbo.setEdad(150); // Edad invalida
        dumbo.setPeso(-500); // Peso inválido
        sombra.setVelocidadMaxima(200); // Velocidad invalida
        
        System.out.println("~ ESTADO FINAL (datos protegidos) ~");
        manchitas.mostrarInfo();
        dumbo.mostrarInfo();
        sombra.mostrarInfo();
        
        System.out.println("~ DEMOSTRANDO ACCESO CONTROLADO ~");
        System.out.println("Nombre de la jirafa: " + manchitas.getNombre());
        System.out.println("Edad del elefante: " + dumbo.getEdad() + " anios");
        System.out.println("Velocidad del puma: " + sombra.getVelocidadMaxima() + " km/h");
        
        // Esto NO funcionaría si tratamos de acceder directamente:
        // System.out.println(manchitas.nombre); // ERROR: nombre es private
        
        System.out.println("Los datos estan protegidos y validados gracias a la encapsulacion");
    }
}