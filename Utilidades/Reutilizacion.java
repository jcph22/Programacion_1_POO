package Programacion_1_POO.Utilidades;

/*
 * Program: ReutilizacionCodigo its a program that contains reusable code for other programs.
 * Author: Juan Carlos Polania Hincapie
 * Date: August 22, 2025
 * Lisence: GNU-GPL v3
 */
import java.util.Scanner;

public class Reutilizacion {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public static String ingresarTexto(String mensaje){
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    public static double ingresarDecimal(String mensaje){
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        scanner.nextLine(); // <-- LIMPIEZA: consume el \n sobrante
        return valor;
    }
    public static int ingresarEntero(String mensaje){
        System.out.print(mensaje);
        int valor = scanner.nextInt();
        scanner.nextLine(); // <-- LIMPIEZA: consume el \n sobrante
        return valor;
    }
    public static boolean ingresarBooleano(String mensaje) {
        System.out.print(mensaje);
        boolean valor = scanner.nextBoolean();
        scanner.nextLine(); // <-- LIMPIEZA
        return valor;
      }
    public static char ingresarChar(String mensaje){
        System.out.print(mensaje);
        char c = scanner.next().charAt(0);
        scanner.nextLine(); // <-- LIMPIEZA
        return c;
    }
    public static boolean validarVocal(char letra){
        boolean esVocal=false;
        letra=Character.toLowerCase(letra);
        if ("aeiouáéíóú".indexOf(letra) !=-1){
            esVocal=true;
        }
        return esVocal;
    }
    public static double [] ingresarArregloDecimal(String mensaje, int cantidad){
        double [] nuevoArreglo = new double [cantidad];
        for (int i=0; i<cantidad; i++){
            nuevoArreglo[i]=ingresarDecimal(mensaje + " (" + (i+1) + " de " + cantidad +"): ");
        }
        return nuevoArreglo;
    }
    public static int [] ingresarArregloEntero(String mensaje, int cantidad){
        int [] nuevoArreglo = new int [cantidad];
        for (int i=0; i<cantidad; i++){
            nuevoArreglo[i]=ingresarEntero(mensaje + " (" + (i+1) + " de " + cantidad +"): ");
        }
        return nuevoArreglo;
    }
    public static String [] ingresarArregloTexto(String mensaje, int cantidad){
        String [] nuevoArreglo = new String [cantidad];
        for (int i=0; i<cantidad; i++){
            nuevoArreglo[i]=ingresarTexto(mensaje + " (" + (i+1) + " de " + cantidad +"): ");
        }
        return nuevoArreglo;
    }
    
}

