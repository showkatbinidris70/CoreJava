/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinalvalie;

/**
 *
 * @author User
 */
public class ArraySort {

    public static void main(String[] args) {
//        int[][] array = {
//            {1, 2},
//            {3, 4},
//            {5, 6}
//        };
        /*  for (int i = array.length - 1; i >= 10; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
                System.out.println();
            }

        }*/
 /* int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][0];
            System.out.println(sum);
        }
         */

        int[][] array = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
