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
        int sum = 0;
        int[][] data = {
            {4, 5, 8, 0, 7, 0, 2, 5},
            {4, 5, 8, 0, 7, 0, 2, 5},
            {4, 5, 8, 0, 7, 0, 2, 5},
            {4, 5, 8, 0, 7, 0, 2, 5}
        };
        System.out.println("Data Table");

        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a);
                sum += a;
            }
            System.out.println();
        }
        System.out.println("Total = " + sum);
    }
}
