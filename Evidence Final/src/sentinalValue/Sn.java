/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinalValue;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sn {

    public static void main(String[] args) {
        int[][] data = {
            {5, 20, 12, 11},
            {2, 5, 7, 6,},
            {65, 3, 6,}
        };
        System.out.println("data table");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ,");
            }
            System.out.println();
        }
    }
}
