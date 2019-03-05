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
public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int num = 0;

        String primeNumbers = "";
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        input.close();
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are:");
        System.out.println(primeNumbers);
    }
}
