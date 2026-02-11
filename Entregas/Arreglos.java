package Programacion_1_POO.Entregas;

import javax.swing.JOptionPane;

public class Arreglos {
    public static void main(String [] args){
        double [] notas = ingresarArregloDecimal();        
        mostrarNotas(notas);
        notas = reemplazarNotas(notas);
        double promedio = calcularPromedio(notas);
        double notaMayor = calcularNotaMayor(notas);
        double notaMenor = calctularNotaMenor(notas);
        ordenarNotas(notas);
        mostrarResumen(notas, promedio, notaMayor, notaMenor);
    }
    public static double [] ingresarArregloDecimal(){        
        int cantidad = leerEntero("Ingresa la cantidad de notas: ");        
        double [] notas = new double [cantidad];        
        for (int i=0; i<cantidad; i++){            
            notas[i]=leerDecimal("Ingrese la nota " + (i+1) + ": ");            
        }        
        return notas;
        
    }
    public static double calcularPromedio(double [] notas){
        double acum = 0;
        for (double nota:notas){
            acum+=nota;
        }        
        return acum/notas.length;
    }
    public static double calcularNotaMayor(double [] notas){
        double mayor = 0;
        for (double nota:notas){
            if (nota>mayor){
                mayor=nota;
            }            
        }        
        return mayor;
    }    
    public static double calctularNotaMenor(double [] notas){
        double menor = notas[0];
        for (double nota:notas){
            if (nota<menor){
                menor=nota;
            }            
        }        
        return menor;
    }
    public static double [] ordenarNotas(double [] notas){
        for (int i=0;i<notas.length-1;i++){
            for (int j=i+1;j<notas.length;j++){
                if (notas[i]>notas[j]){
                    double aux = notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                }
            }
        }
        return notas;
    }
    public static double [] reemplazarNotas(double [] notas){
        while (true){
            String resumen = "Notas registradas: \n[ ";
            for (int i=0;i<notas.length;i++){
                resumen+=notas[i]+"  ";
            }
            resumen+="]\n";
            int posicion = leerEntero("Ingresa la posicion que deseas remplazar: \n"+resumen);          
            if (posicion<0||posicion>notas.length-1){
                JOptionPane.showMessageDialog(null, "Error, ingrese un valor entre 0 y "+(notas.length-1)+".");
            }
            else{
                double nota = leerDecimal("Ingrese la nueva nota: ");
                notas[posicion]=nota;
                break;
            }
        }
        return notas;
    }
    public static void mostrarResumen(double [] notas, double promedio, double notaMayor, double notaMenor){
        String resumen = "=== RESUMEN DE CALIFICACIONES ===\n\n";
        resumen += "Notas registradas: \n";
        for (int i=0;i<notas.length;i++){
            resumen+="Nota "+(i+1)+": "+notas[i]+"\n";
        }
        resumen += "\n--------------------------------\n";
        resumen += "Promedio Final: " + String.format("%.2f", promedio) + "\n";
        resumen += "Nota mayor: "+notaMayor+"\n";
        resumen += "Nota menor: "+notaMenor+"\n";
        resumen += "\n--------------------------------\n";
        JOptionPane.showMessageDialog(null, resumen);
    }
    public static void mostrarNotas(double [] notas){
        String resumen = "=== NOTAS REGISTRADAS ===\n\n";
        for (int i=0;i<notas.length;i++){
            resumen+="Nota "+(i+1)+": "+notas[i]+"\n";
        }
        resumen += "\n--------------------------------\n";
        JOptionPane.showMessageDialog(null, resumen);
    }
    public static int leerEntero(String mensaje){
        while(true){
            String lectura = JOptionPane.showInputDialog(null, mensaje);
            if (lectura==null){
                System.exit(0);
            }
            try{
                return Integer.valueOf(lectura);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, ingrese un valor entero.");
            }
        }
    }
    public static double leerDecimal(String mensaje){
        while(true){
            String lectura = JOptionPane.showInputDialog(null, mensaje);
            if (lectura==null){
                System.exit(0);
            }
            try{
                return Double.valueOf(lectura);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error, ingrese un valor decimal.");
            }
        }
    }
}
