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
            {41, 25, 14, 12, 4, 15,},
            {41, 25, 14, 12, 4, 15,},
            {41, 25, 14, 12, 4, 15,},
            {41, 25, 14, 12, 4, 15,}
        };
        System.out.println("Data Table");

        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a);
                sum += a;
            }
        }
        System.out.println(sum);
    }

}
