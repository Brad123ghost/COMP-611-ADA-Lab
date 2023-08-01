/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author Bradley
 */
public class LabOneApplication {
    float[][] ajStar = {
            {0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0}
        };
        
    float[][] ajLine = {
        {0, 1, 0, 0, 0},
        {1, 0, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 1},
        {0, 0, 0, 1, 0}
    };

    float[][] ajComplete = {
        {0, 1, 1, 1},
        {1, 0, 1, 1},
        {1, 1, 0, 1},
        {1, 1, 1, 0},

    };
    
    float[][] initalVectorMatrix;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LabOneApplication app = new LabOneApplication();
        MatrixOperations mOp = new MatrixOperations();
        
        System.out.println("Please Choose an Exisiting Graph: ");
        System.out.println(" 1) Star Graph\n 2) Line Graph\n 3) Complete Graph");
        int userInput = keyboard.nextInt();
        
        float[][] selectedMatrix = new float[1][1];
        float[][] identityMatrix = new float[1][1];
        float[][] initialVectorMatrix = new float[1][1];
        if(userInput == 1) {
            selectedMatrix = app.ajStar;
        } else if (userInput == 2) {
            selectedMatrix = app.ajLine;
        } else if (userInput == 3) {
            selectedMatrix = app.ajComplete;
        }
        app.clear();
        identityMatrix = mOp.createMatrixI(selectedMatrix);
        selectedMatrix = mOp.addMatrix(selectedMatrix, identityMatrix);
        initialVectorMatrix = mOp.createInitialVectorMatrix(selectedMatrix);
        
        System.out.println("Adjacency Matrix + Identity: ");
        mOp.printMatrix(selectedMatrix);
        
        System.out.println("\nFinal Vectors (Last Iteration):");
        initialVectorMatrix = mOp.powerIteration(selectedMatrix, initialVectorMatrix);
        mOp.printMatrix(initialVectorMatrix);
        
        System.out.println("\nCentrality Vectors:");
        mOp.printMatrix(mOp.normalize(initialVectorMatrix));
        
    }
    
    public void clear() {
        for(int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }
}
