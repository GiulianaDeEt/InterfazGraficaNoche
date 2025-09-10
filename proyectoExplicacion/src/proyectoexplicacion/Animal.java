/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE PADRE - Animal con encapsulación completa
class Animal {
    // Atributos PRIVADOS - solo accesibles desde esta clase
    private String nombre;
    private int edad;
    private double peso;
    private String especie;
    
    // Constructor
    public Animal(String nombre, int edad, double peso, String especie) {
        // Usamos los setters para validar desde la construcción
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setPeso(peso);
        this.especie = especie; // La especie no cambia, acceso directo
    }
    
    // GETTERS - métodos para leer los atributos privados
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    // SETTERS - métodos para modificar los atributos con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre.trim();
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
            this.nombre = "Sin nombre";
        }
    }
    
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 100 anios");
            this.edad = 0;
        }
    }
    
    public void setPeso(double peso) {
        if (peso > 0 && peso <= 10000) { // máximo 10 toneladas
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe ser positivo y menor a 10000 kg");
            this.peso = 1.0;
        }
    }
    
    // Métodos públicos
    public void dormir() {
        System.out.println(nombre + " esta durmiendo...");
    }
    
    public void respirar() {
        System.out.println(nombre + " esta respirando");
    }
    
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }
    
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido");
    }
    
    // Método que usa los getters internamente
    public void mostrarInfo() {
        System.out.println("Animal: " + getNombre() + 
                          " | Especie: " + getEspecie() + 
                          " | Edad: " + getEdad() + " anios" +
                          " | Peso: " + getPeso() + " kg");
    }
    
    // Método para cumpleaños (demuestra uso de setter)
    public void cumplirAnios() {
        setEdad(edad + 1);
        System.out.println(nombre + " cumplio anios! Ahora tiene " + edad + " anios");
    }
    
    // Método para cambio de peso (con validación automática)
    public void cambiarPeso(double nuevoPeso) {
        double pesoAnterior = peso;
        setPeso(nuevoPeso);
        if (peso != pesoAnterior) {
            System.out.println(nombre + " cambio de peso: " + pesoAnterior + " kg a " + peso + " kg");
        }
    }
}