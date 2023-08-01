/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author bradleychung
 */
public class PageRank {
    float[][] prGraph = {
        {0, 1, 0, 0, 0},
        {0, 0, 0, 0, 0},
        {1, 1, 0, 1, 1},
        {0, 0, 1, 0, 1},
        {0, 0, 0, 1, 0}
    };
    
    float dampingFactor = 0.15f;
}
