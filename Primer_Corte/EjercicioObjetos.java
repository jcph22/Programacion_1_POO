package Programacion_1_POO.Primer_Corte;
import Programacion_1_POO.Utilidades.Reutilizacion;

public class EjercicioObjetos {
    public static void main(String[] args) {
        int tam = Reutilizacion.ingresarEntero("¿Cuántas personas registrarás?: ");
        
        // Creamos el arreglo que guardará objetos tipo "Persona"
        Persona[] grupo = new Persona[tam];

        // Llenado del arreglo
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("\nPersona #" + (i + 1));
            String n = Reutilizacion.ingresarTexto("Nombre: ");
            int e = Reutilizacion.ingresarEntero("Edad: ");
            
            // ¡AQUÍ SE CONECTAN! 
            // Llamamos al constructor de la otra clase para crear el objeto
            grupo[i] = new Persona(n, e);
        }

        // Impresión usando los métodos de la clase Persona
        System.out.println("\n--- REGISTRO FINAL ---");
        for (Persona p : grupo) {
            // Usamos el método que creamos en la plantilla
            System.out.println(p.obtenerResumen());
        }
    }   
}
