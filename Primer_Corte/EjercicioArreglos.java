package Programacion_1_POO.Primer_Corte;
 
import Programacion_1_POO.Utilidades.Reutilizacion;

public class EjercicioArreglos {
    public static void main(String[]args){
    int cantidad = Reutilizacion.ingresarEntero("Ingresa el tamaño del arreglo: ");
    int [] arreglo = Reutilizacion.ingresarArregloEntero("Ingresa el número", cantidad);
    imprimirArreglo(arreglo);
    int [] arreglo2 = reemplazarNumeroArreglo(arreglo);
    imprimirArreglo(arreglo2);
    buscarElemento(arreglo2);
    identificarNumeroMasRepetido(arreglo2);
    validarNumerosPerfectos(arreglo2);
    int [] arreglo3 = eliminarElementoArreglo(arreglo2);
    imprimirArreglo(arreglo3);
    }
    public static void imprimirArreglo(int [] datos){
        System.out.print("Este es el arreglo: \n[ ");
        for (int dato:datos){
            System.out.print(dato+" ");
        }
        System.out.print("]\n");
    }
    public static int [] reemplazarNumeroArreglo(int [] datos){
        int posicion = Reutilizacion.ingresarEntero("Ingresa la posición que quieres reemplazar (0-"+(datos.length-1)+"):");
        if (posicion<0||posicion>=datos.length){
            Reutilizacion.mostrarMensaje("Ingrese un valor entre 0 y "+(datos.length-1));
            posicion = Reutilizacion.ingresarEntero("Ingresa la posición que quieres reemplazar (0-"+(datos.length-1)+":");
        }
        datos [posicion] = Reutilizacion.ingresarEntero("ingresa el valor por el que deseas reemplazarlo: ");
        return datos;
    }
    public static void buscarElemento(int [] datos){
        int elemento = Reutilizacion.ingresarEntero("Ingresa el valor que deseas buscar: ");
        int contador = 0;
        for (int i = 0; i<datos.length;i++){
            if (datos[i]==elemento){
                contador++;
            }
        }
        int [] arreglo = new int [contador];
        int k = 0;
        for (int i = 0; i<datos.length;i++){
            if (datos[i]==elemento){
                arreglo[k]=i;
                k++;
            }
        }
        if (contador==0){
            System.out.println("El valor que buscas no se encuentra en el arreglo.");
        }else{
        System.out.println("Las posiciones del arreglo en las que se encuentra el número que buscas son las siguientes: ");
        for (int dato:arreglo){
            System.out.println("-> "+dato);
        }
        }
    }
    public static void identificarNumeroMasRepetido(int [] datos){
        int contador = 0;
        int [] arreglo = new int [datos.length];
        for (int i=0;i<datos.length;i++){
            for (int j=i+1;j<datos.length;j++){
                if(datos[i]==datos[j]){
                    contador++;
                }
            }
            arreglo[i]=contador;
            contador=0;
        }
        int inicial = arreglo[0];
        
        for(int l=1;l<arreglo.length;l++){
            if(inicial<arreglo[l]){
                inicial=arreglo[l];
            }
        }
        int cont=0;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==inicial){
                cont++;
            }
        }
        int k=0;
        int [] posicion = new int [cont];
        for (int i=0;i<datos.length;i++){
            if (arreglo[i]==inicial){
                posicion[k]=datos[i];
                k++;
            }
        }
        if (posicion.length==1){
        System.out.println("El número que más se repite es: "+datos[k]);
                } else {
            System.out.println("Los números que más se repiten son: ");
            for (int dato:posicion){
            System.out.println("-> "+dato);

        }
        }
    }
    public static void validarNumerosPerfectos(int [] datos){
        int contador = 0;
        boolean bandera = false;
        for (int i=0;i<datos.length;i++){
            for (int j=1;j<datos[i];j++){
                if(datos[i]%j==0){
                    contador+=j;
                }
            }
            if (datos[i]==contador){
                bandera=true;
                break;
            } else {
                contador=0;
            }
        }
        if (bandera){
            System.out.println("Si hay números perfectos en el arreglo.");
        } else {
            System.out.println("No hay números perfectos en el arreglo.");
        }

    }
    public static int [] eliminarElementoArreglo(int [] datos){
        int [] arreglo = new int [datos.length-1];
        int posicion = Reutilizacion.ingresarEntero("Ingresa la posición que quieres eliminar (0-"+(datos.length-1)+"):");
        while (posicion<0||posicion>datos.length-1){
            Reutilizacion.mostrarMensaje("Error, ingrese un valor entre 0 y "+(datos.length-1)+".");
            posicion = Reutilizacion.ingresarEntero("Ingresa la posición que quieres reemplazar (0-"+(datos.length-1)+"):");
        }
        int k=0;
        for (int i=0;i<datos.length;i++){
            if (i!=posicion){
                arreglo[k]=datos[i];
                k++;
            }
        }
        return arreglo;        
    }
    
}
