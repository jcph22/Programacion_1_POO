package Programacion_1_POO.Primer_Corte;

import Programacion_1_POO.Utilidades.Reutilizacion;

public class EjercicioArreglosPro {

    public static void main(String[] args) {
        // 1. Inicialización
        int cantidad = Reutilizacion.ingresarEntero("Ingresa el tamaño del arreglo: ");
        int[] arreglo = Reutilizacion.ingresarArregloEntero("Ingresa el número", cantidad);
        // 2. Ejecución de procesos
        imprimirArreglo(arreglo);
        
        // Reemplazar elemento (Tu lógica de eliminar actual)
        arreglo = reemplazarElemento(arreglo);
        imprimirArreglo(arreglo);

        // Búsqueda y Análisis
        buscarElemento(arreglo);
        identificarMasRepetido(arreglo);
        
        // Validación de perfectos
        if (hayNumerosPerfectos(arreglo)) {
            System.out.println("\n[!] Resultado: Existen números perfectos en el arreglo.");
        } else {
            System.out.println("\n[!] Resultado: No se encontraron números perfectos.");
        }
        // INTERACCIÓN CON EL USUARIO
        int posAEliminar = Reutilizacion.ingresarEntero("¿Qué índice deseas eliminar? (0-" + (arreglo.length - 1) + "): ");
        
        // VALIDACIÓN (Podrías usar tu while aquí)
        while (posAEliminar<0||posAEliminar>arreglo.length-1){
            Reutilizacion.mostrarMensaje("Error, ingrese un valor entre 0 y "+(arreglo.length-1)+".");
            posAEliminar = Reutilizacion.ingresarEntero("Ingresa la posición que quieres reemplazar (0-"+(arreglo.length-1)+"):");
        }
        // INTEGRACIÓN: Reasignamos el arreglo con el resultado del método
        arreglo = eliminarPorPosicion(arreglo, posAEliminar);
        
        System.out.println("Elemento eliminado con éxito.");
        imprimirArreglo(arreglo);
    }

    // --- MÉTODOS DE ACCIÓN ---

    public static void imprimirArreglo(int[] datos) {
        System.out.print("\n>>> Contenido del arreglo: [ ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + (i == datos.length - 1 ? "" : ", "));
        }
        System.out.println(" ]");
    }

    public static int[] reemplazarElemento(int[] datos) {
        int limite = datos.length - 1;
        int posicion = Reutilizacion.ingresarEntero("Posición a modificar (0 a " + limite + "): ");

        // Validación robusta con while
        while (posicion < 0 || posicion > limite) {
            Reutilizacion.mostrarMensaje("Error. La posición debe estar entre 0 y " + limite);
            posicion = Reutilizacion.ingresarEntero("Intenta de nuevo: ");
        }

        datos[posicion] = Reutilizacion.ingresarEntero("Ingresa el nuevo valor: ");
        return datos;
    }

    public static void buscarElemento(int[] datos) {
        int objetivo = Reutilizacion.ingresarEntero("\n¿Qué valor deseas buscar?: ");
        boolean encontrado = false;
        
        System.out.print("Valor encontrado en posiciones: ");
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == objetivo) {
                System.out.print("[" + i + "] ");
                encontrado = true;
            }
        }

        if (!encontrado) System.out.print("Ninguna (El valor no existe)");
        System.out.println();
    }

    public static void identificarMasRepetido(int[] datos) {
        int maxRepeticiones = 0;
        
        // Primero: Encontrar la frecuencia más alta
        for (int i = 0; i < datos.length; i++) {
            int cuenta = 0;
            for (int j = 0; j < datos.length; j++) {
                if (datos[i] == datos[j]) cuenta++;
            }
            if (cuenta > maxRepeticiones) maxRepeticiones = cuenta;
        }

        // Segundo: Mostrar los números que alcancen esa frecuencia (sin repetir)
        System.out.print("Número(s) más repetido(s) (Frecuencia: " + maxRepeticiones + "): ");
        // Usamos un pequeño truco de "bandera" para no imprimir el mismo número dos veces
        for (int i = 0; i < datos.length; i++) {
            int cuenta = 0;
            for (int j = 0; j < datos.length; j++) {
                if (datos[i] == datos[j]) cuenta++;
            }
            if (cuenta == maxRepeticiones) {
                // Verificamos si ya lo mostramos antes para no repetir el mensaje
                boolean yaMostrado = false;
                for (int k = 0; k < i; k++) {
                    if (datos[k] == datos[i]) yaMostrado = true;
                }
                if (!yaMostrado) System.out.print(datos[i] + " ");
            }
        }
        System.out.println();
    }

    // --- LÓGICA DE NÚMERO PERFECTO (Separada por responsabilidad) ---

    public static boolean esPerfecto(int n) {
        if (n <= 0) return false;
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) suma += i;
        }
        return suma == n;
    }

    public static boolean hayNumerosPerfectos(int[] datos) {
        for (int num : datos) {
            if (esPerfecto(num)) return true; // Reutilizamos el método anterior
        }
        return false;
    }
    /**
     * Elimina un elemento en una posición específica y retorna un nuevo arreglo.
     * Este método es "puro": no imprime nada ni pide datos, solo procesa.
     */
    public static int[] eliminarPorPosicion(int[] datos, int posicion) {
    // Si la posición es inválida, retornamos el mismo arreglo para evitar errores
    if (posicion < 0 || posicion >= datos.length) {
        return datos; 
    }

    int[] nuevoArreglo = new int[datos.length - 1];
    int k = 0;
    for (int i = 0; i < datos.length; i++) {
        if (i != posicion) {
            nuevoArreglo[k] = datos[i];
            k++;
        }
    }
    return nuevoArreglo;
}
}