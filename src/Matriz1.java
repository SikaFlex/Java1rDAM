import java.util.Scanner;

import static java.lang.Math.random;

public class Matriz1 {
    public static void main(String[] args) {

        final int filas = 5;
        final int columnas = 5;
        int[][] matriz1 = new int[filas][columnas];
        int [][] matriz2= new int[filas][columnas];
        int [][] matriz3= new int [filas][columnas];
        int resultado;

        System.out.println("Matriz A");
        CrearMatriz(matriz1,filas,columnas);
        MostrarMatriz(matriz1,filas, columnas);
        System.out.println("\t \t \t \t");

        System.out.println("Matriz B");
        CrearMatriz(matriz2,filas,columnas);
        MostrarMatriz(matriz2,filas, columnas);
        System.out.println("Matriz C");
        SumarMatrizes(matriz1,matriz2,matriz3);
        MostrarMatriz(matriz3,filas,columnas);




    }

    public static void MostrarMatriz(int[][] matriz,int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            int suma=0;
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+"\t");

            }
            System.out.println("");
        }
    }

    public static void CrearMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

    }

    public static void SumarMatrizes(int [][] matriz1,int [][]matriz2,int [][] matriz3) {
        for (int i = 0; i < matriz1.length; i++) {
            int resultado=0;
            for (int j = 0; j < matriz2[i].length; j++) {
                resultado=matriz1[i][j]+matriz2[i][j];
                matriz3[i][j]=resultado;
            }
        }


    }
}



