package Matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) count ++;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal principal");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        System.out.println("Total de números negativos: " + count);

        sc.close();
    }
}
