package com.JavaProgrammingCourse;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMult {
    public  static void main(String []args) {
        int m,n,p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows in first matrix");
        m = sc.nextInt();
        System.out.println("Enter no of columns in first matrix");
        n = sc.nextInt();
        System.out.println("Enter no of rows in second matrix");
        p = sc.nextInt();
        System.out.println("Enter no of columns in second matrix");
        q = sc.nextInt();
        if ( n != p) {
            System.out.println("No of columns in first matrix must be equal to no of rows in second matrix\nTry again: ");
            return;
        }
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[p][q];
        System.out.println("Enter elements of first matrix");
        for(int i = 0; i < matrix1.length; i++) {
            for(int j  = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix");
        for(int i = 0; i < matrix2.length; i++) {
            for(int j  = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        // calculate the mutliplication if it is possible
        int[][] c = new int[m][q];
        for(int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                for(int k = 0; k < n; k++) {
                    c[i][j] = c[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for(int[] arr : c) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
