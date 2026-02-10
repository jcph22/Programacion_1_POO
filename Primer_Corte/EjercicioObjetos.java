package Programacion_1_POO.Primer_Corte;
import Programacion_1_POO.Utilidades.Reutilizacion;

public class EjercicioObjetos {
    public static void main(String[] args) {
        int tam = Reutilizacion.ingresarEntero("¿Cuántas personas registrarás?: ");
        Persona[] grupo = new Persona[tam];

        // Llenado (Igual que antes, usando el motor de Reutilizacion ya corregido)
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("\nRegistro #" + (i + 1));
            String n = Reutilizacion.ingresarTexto("Nombre: ");
            int e = Reutilizacion.ingresarEntero("Edad: ");            
            // ¡AQUÍ SE CONECTAN! 
            // Llamamos al constructor de la otra clase para crear el objeto
            grupo[i] = new Persona(n, e);
        }

        // IMPRESIÓN PRO
        System.out.println("\n--- LISTA DE PERSONAS ---");
        for (Persona p : grupo) {
            // ¡MAGIA! No necesitas llamar a p.getNombre() ni nada.
            // Al pasar el objeto 'p' al println, Java busca el toString() automáticamente.
            System.out.println(p); 
        }
    }
}