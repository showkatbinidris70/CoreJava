/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int length = input.nextInt();
        int a[] = new int[length];

        int max = 0;
        int min = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("Enter your number: ");
            a[i] = input.nextInt();

            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] < max) {
                max = a[i];
            } else if (a[i] > min) {
                min = a[i];
            } else {
                continue;
            }
        }
        System.out.println("Biggest numbr is: " + max);
        System.out.println("Lowest numbr is: " + min);
    }
}
