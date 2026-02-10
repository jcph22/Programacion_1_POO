package Programacion_1_POO.Primer_Corte;

public class Persona {
    // 1. Atributos PRIVADOS (Encapsulamiento)
    private String nombre;
    private int edad;

    // 2. Constructor (El que "construye" el objeto en memoria)
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // "Este nombre de la clase = el nombre que me dieron"
        this.edad = edad;
    }

    // 3. Getters (Para poder LEER los datos desde otro archivo)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // 4. Un método de acción
    public String obtenerResumen() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }
}
