package Programacion_1_POO.Primer_Corte;

import javax.swing.JOptionPane;

public class Arreglos {
    public static void main(String [] args){
        int cantidadNotas=Integer.valueOf(JOptionPane.showInputDialog(null, "Ingrese el numero de notas: "));
        double [] notas = new double[cantidadNotas];
        for (int i=0;i<notas.length;i++){
            notas[i]=Double.valueOf(JOptionPane.showInputDialog(null, "Ingrese la nota "+(i+1)+":"));
        }
        double promedio = calcularPromedio(notas);
        double notaMayor = calcularNotaMayor(notas);
        double notaMenor = calctularNotaMenor(notas);
        JOptionPane.showMessageDialog(null,"La nota final es: "+promedio);
        JOptionPane.showMessageDialog(null, "La nota mayor es: "+notaMayor, "Notas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "La nota menor es: "+notaMenor, "Notas", JOptionPane.INFORMATION_MESSAGE);
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
}
