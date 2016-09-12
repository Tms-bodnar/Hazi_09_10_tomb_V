/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hazi_09_10_v;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class Hazi_09_10_V {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// gyökök tömbje
        double[] gyokok = new double[31];
        for (int i = 1; i <= gyokok.length - 1; i++) {
            double gyok = Math.sqrt(i);
            gyokok[i] = gyok;
            System.out.println("Az " + i + " négyzetgyöke: " + gyokok[i]);
        }
// első ötven prím tömbje
        int szam = 2;
        int[] primek = new int[80];
        int j = 0;
        do {
            boolean prime = true;
            for (int i = 2; i <= szam / 2; i++) {
                if (szam % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primek[j] = szam;
                j++;
            }
            szam++;
        } while (j < 80);
        for (int k = 0; k < primek.length; k++) {
            System.out.println("A(z) " + (k + 1) + ". prímszám: " + primek[k]);
        }

// n x n mártix, átlóban egyesek
        Scanner sc = new Scanner(System.in);
        System.out.println("Mekkora mátrixot hozzak létre?");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
// ez egy üres mátrix kiíratása
//            for (int i = 0; i < matrix.length; i++) {
//            for (int k = 0; k < matrix[i].length; k++) {
//                System.out.print(matrix[i][k]+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (i == k) {
                    matrix[i][k] = 1;
                } else {
                    matrix[i][k] = 0;
                }
                if ((i + k) == (n - 1)) {
                    matrix[i][k] = 1;
                }
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
// két mátrix öszeadása

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrix3 = new int[3][3];
// matrix1 
        System.out.println("Matrix1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                matrix1[i][k] = (int) (Math.random() * 10);

                System.out.print(matrix1[i][k] + "\t");
            }
            System.out.println();
        }
        //matrix2
        System.out.println("Matrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int k = 0; k < matrix2[i].length; k++) {
                matrix2[i][k] = (int) (Math.random() * 10);

                System.out.print(matrix2[i][k] + "\t");
            }
            System.out.println();
        }
//matrix3
        System.out.println("Matrix3 összeadás után:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                matrix3[i][k] = matrix1[i][k];
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int k = 0; k < matrix2[i].length; k++) {
                matrix3[i][k] = matrix3[i][k] + matrix2[i][k];
                System.out.print(matrix3[i][k] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix3 szorzás után:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                matrix3[i][k] = matrix1[i][k];
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int k = 0; k < matrix2[i].length; k++) {
                matrix3[i][k] = matrix3[i][k] * matrix2[i][k];
                System.out.print(matrix3[i][k] + "\t");
            }
            System.out.println();
        }

    }

}
