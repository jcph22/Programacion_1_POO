package Programacion_1_POO.Primer_Corte;

import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args){
        int [][] matriz = ingresarMatriz();
        esMatrizSimetrica(matriz);
        JOptionPane.showMessageDialog(null,"La suma de la diagonal principal es: "+sumarDiagonalPrincipal(matriz));
        JOptionPane.showMessageDialog(null,"La suma de la diagonal secundaria es: "+sumarDiagonalSecundaria(matriz));
        dibujarPiramide();        
    }
    public static void dibujarPiramide(){        
        int altura;
        while(true){
            altura = leerEntero("Ingrese la altura de la piramide (debe ser impar): ");
            if (altura%2!=0&&altura>0){
                break;
            } JOptionPane.showMessageDialog(null,"La altura debe ser impar y mayor a 0.");
        } 
        int columnas = (altura*2)-1;
        String [][] matriz = new String [altura][columnas];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if (j<(columnas-altura-i)||j>(columnas-altura+i)){
                    matriz[i][j]="   ";
                }else{
                    matriz[i][j]=" * ";
                }
            }
        }
        for (int i=0;i<matriz.length;i++){
            System.out.print("[");
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.print("]\n");
        }
    }           
    public static int [][] ingresarMatriz(){
        int filas = leerEntero("Ingrese el número de filas de la matriz: ");
        int columnas = leerEntero("Ingrese el número de columnas de la matriz: ");
        int [][] matriz = new int[filas][columnas];
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                matriz[i][j] = leerEntero("Ingrese el elemento ["+(i+1)+"]["+(j+1)+"]");
            }
        }
        return matriz;
    }
    public static void esMatrizSimetrica(int [][] matriz){
        if (matriz == null || matriz.length == 0) return;
        
        if (matriz.length != matriz[0].length){
            JOptionPane.showMessageDialog(null,"La matriz no es cuadrada.");
            return;
        }   
        boolean check = true;
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0;j<i;j++){
                if (matriz[i][j]!=matriz[j][i]){
                    check=false;
                    break;
                }
            }
            if(!check){
                break;
            }
        }
        if (check){
            JOptionPane.showMessageDialog(null,"La matriz es simétrica.");
        } else {
            JOptionPane.showMessageDialog(null,"La matriz no es simétrica.");
        }
    }
    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sum += matriz[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int sum = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j=(matriz.length-i-1);j>=0;j--){
                if (j==(matriz.length-i-1)){
                    sum += matriz[i][j];
                    break;
                }
            }
        }
        return sum;
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
