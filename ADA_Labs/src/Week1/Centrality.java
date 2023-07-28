/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Bradley
 */
public class Centrality { 
    public static void main(String[] args) {
        float[][] matrixA = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0}
        };
        
        float[][] matrixB = {
            {0, 1, 1, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 1},
            {0, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };
        float[][] initialVectorMatrixB = {
            {1},
            {1},
            {1},
            {1},
            {1},
            {1}
        };
        float[][] initialVectorMatrix = {
            {1},
            {1},
            {1}
        };
        
        
        
        MatrixOperations matrixOp = new MatrixOperations();
        
        float[][] idenMatrix = matrixOp.createMatrixI(matrixA);
        
        float[][] newMatrix = matrixOp.addMatrix(matrixA, idenMatrix);
        
//        System.out.println("Matrix A:");
//        matrixOp.printMatrix(matrixA);
//        
//        System.out.println("\nIdentity Matrix:");
//        matrixOp.printMatrix(idenMatrix);
//        
//        System.out.println("\nMatrix A + I:");
//        matrixOp.printMatrix(newMatrix);
//    
//        System.out.println("(A + I)(timeMatrix):");
//        matrixOp.printMatrix(matrixOp.multiplyMatrix(newMatrix, initialVectorMatrix));

        System.out.println("Matrix A + I:");
        newMatrix = matrixOp.addMatrix(matrixB, matrixOp.createMatrixI(matrixB));
        matrixOp.printMatrix(newMatrix);
        
        System.out.println("\nFirst Iteration:");
//        initialVectorMatrixB = matrixOp.multiplyMatrix(newMatrix, initialVectorMatrixB);
        initialVectorMatrixB = matrixOp.powerIteration(matrixB, initialVectorMatrixB);
        matrixOp.printMatrix(initialVectorMatrixB);
    }
}
