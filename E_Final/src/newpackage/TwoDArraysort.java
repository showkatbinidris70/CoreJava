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
public class TwoDArraysort {

    public static void main(String[] args) {
        int sum = 0;
        int[][] data = {
            {12, 42, 85, 10, 45},
            {12, 42, 85, 32, 45},
            {12, 42, 85, 32, 45},
            {12, 42, 85, 32, 45}

        };
        System.out.println("Data table");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ,");
                sum+=a;
            }
            System.out.println("Total " + sum);

        }
    }
}
