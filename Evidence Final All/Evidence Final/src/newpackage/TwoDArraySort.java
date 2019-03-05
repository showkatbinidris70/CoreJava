/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class TwoDArraySort {

    public static void main(String[] args) {
        int[][] data = {
            {10, 50, 15, 30},
            {25, 22, 30, 40},
            {20, 23, 15, 30},
            {45, 30, 40, 44}
        };
        System.out.println("Data Table");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ,");
            }
            System.out.println();
        }
    }
}
