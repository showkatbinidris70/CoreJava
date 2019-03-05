/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class TowDSort {

    public static void main(String[] args) {
        int[][] data = {
            {4, 5, 7, 1, 6, 0, 7,},
            {4, 5, 7, 1, 6, 0, 7,},
            {4, 5, 7, 1, 6, 0, 7,},
            {4, 5, 7, 1, 6, 0, 7,}
        };
        System.out.println("table");

        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a);
            }
        }
        System.out.println();
    }
}
