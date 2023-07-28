/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author bradleychung
 */
public class PowerIteration {
    public static void main(String[] args) {
        int[][] ajStart = {
            {0, 1, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0}
        };
        
        int[][] ajLine = {
            {0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}
        };
        
        int[][] ajComplete = {
            {0, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 0},
            
        };
        
        System.out.println("Matrix: ");
        printMatrix(ajComplete);
        System.out.println("Identity Matrix:");
        printMatrix(createMatrixI(ajComplete));
         
    }
    
    private static int[][] createMatrixI(int[][] matrixA) {
        int matrixSize = matrixA.length;
        
        int[][] matrixI = new int[matrixSize][matrixSize];
        
        for(int i = 0; i < matrixSize; i++) {
            for(int j = 0; j < matrixSize; j++) {
                if(i == j) {
                    matrixI[i][j] = 1;
                } else {
                    matrixI[i][j] = 0;
                }
            }
        }
        return matrixI;
    }
    
    private static void printMatrix(int[][] printMatrix) {
        
        for (int[] printMatrix1 : printMatrix) {
            for (int j = 0; j < printMatrix.length; j++) {
                System.out.print(printMatrix1[j] + " ");
            }
            System.out.println("");
        }
    }
}
