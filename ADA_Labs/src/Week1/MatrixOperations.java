/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Bradley
 */
public class MatrixOperations {
    public float[][] createMatrixI(float[][] matrixA) {
        int matrixSize = matrixA.length;
        
        float[][] matrixI = new float[matrixSize][matrixSize];
        
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
    
    public void printMatrix(float[][] printMatrix) {
        
        for (float[] printMatrix1 : printMatrix) {
            for (int j = 0; j < printMatrix1.length; j++) {
                System.out.print(printMatrix1[j] + " ");
            }
            System.out.println("");
        }
    }
    
    public float[][] addMatrix(float[][] matrixA, float[][] matrixB) {
        int matrixACol = matrixA.length;
        int matrixARow = matrixA[0].length;
        
        int matrixBCol = matrixB.length;
        int matrixBRow = matrixB[0].length;
        
        float[][] tempMatrix;
        if(matrixACol != matrixBCol && matrixARow != matrixBRow) {
            System.out.println("Matrix Sizes Do Not Match!");
        } else {
            tempMatrix = new float[matrixACol][matrixACol];
            for(int i = 0; i < matrixACol; i++) {
                for(int j = 0; j < matrixACol; j++) {
                    tempMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }
            
            return tempMatrix;
        }
        
        return null;
    }
    
    public float[][] multiplyMatrix(float[][] matrixA, float[][] matrixB) {
        int matrixACol = matrixA.length;
        int matrixARow = matrixA[0].length;
        
        int matrixBCol = matrixB.length;
        int matrixBRow = matrixB[0].length;
        
        float[][] tempMatrix;
        int count = 0;
       
        if(matrixARow != matrixBCol) {
            System.out.println("Matrix Size Mismatch");
        } else {
            tempMatrix = new float[matrixARow][matrixBRow];
            float sum = 0;

            for(int i = 0; i < matrixBRow; i++) {
                for(int j = 0; j < matrixARow; j++) {
                    for(int k = 0; k < matrixBCol; k++) {
                        float a = matrixA[j][k];
                        float b = matrixB[k][i];
//                        System.out.println(a * b);
//                        System.out.println(a + " * " + b);
//                        System.out.println();
                        sum += (a * b);
                    }

                    tempMatrix[j][i] = sum;
//                    System.out.println("SUM: " + sum);
//                    System.out.println("NEW LINE");
                    sum = 0;
                }
            }
            return tempMatrix;
        }
//        
        return null;
    }
    
    public float[][] powerIteration(float[][] matrixA, float[][] matrixB) {
        float[][] tempMatrix = this.multiplyMatrix(matrixA, matrixB);
        
        float u = tempMatrix[0][0];
        
        
        // Divide temp matrix by u
        for(int i = 0; i < tempMatrix.length; i++) {
            float newNum = tempMatrix[i][0]/u;
            float rounded = (float) Math.round(newNum * 1000f)/1000f;
            tempMatrix[i][0] = rounded;
        }
        
        return tempMatrix;
    }
}
