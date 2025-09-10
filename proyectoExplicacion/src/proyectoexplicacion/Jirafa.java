/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoexplicacion;

// CLASE HIJA - hereda de Animal
class Jirafa extends Animal {
    // Atributos específicos de la jirafa
    private double altura;
    private String colorManchas;
    
    // Constructor que llama al constructor padre
    public Jirafa(String nombre, int edad, double peso, double altura, String colorManchas) {
        super(nombre, edad, peso, "Giraffa camelopardalis"); // Llamada al constructor padre
        this.altura = altura;
        this.colorManchas = colorManchas;
    }
    
    // Métodos específicos de la jirafa
    public void estirarCuello() {
        System.out.println(nombre + " estira su largo cuello para alcanzar las hojas más altas");
    }
    
    public void caminar() {
        System.out.println(nombre + " camina elegantemente con sus largas patas");
    }
    /**
    // Sobrescribir método heredado
    @Override
    public void comer() {
        System.out.println(nombre + " esta comiendo hojas de acacia desde las copas de los arboles");
    }
    
    @Override
    public void dormir() {
        System.out.println(nombre + " duerme de pie, como hacen las jirafas");
    }
    
    // Getter específico
    public double getAltura() {
        return altura;
    }
    * */
}
