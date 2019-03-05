/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p863;

import static java.util.Arrays.sort;
import static java.util.Collections.list;

/**
 *
 * @author User
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 1, 6, 9, 2, 7};
        sort(numbers);
        boolean list = false;
        System.out.println(list);
    }

    public static void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k++) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

}
