package Programacion_1_POO.Primer_Corte;

public class Persona {
    // 1. Atributos PRIVADOS (Nadie los toca desde afuera directamente)
    private String nombre;
    private int edad;

    // 2. Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // 3. GETTERS Y SETTERS (La aduana de tus datos)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { // Ejemplo de validación que solo permiten los Setters
            this.edad = edad;
        }
    }

    // 4. El método toString (Cómo se imprime el objeto)
    @Override
    public String toString() {
        return ">>> Persona [Nombre: " + nombre + " | Edad: " + edad + "]";
    }
}