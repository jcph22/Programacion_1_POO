package Programacion_1_POO.Primer_Corte;

public class Matrices {
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
    
}
