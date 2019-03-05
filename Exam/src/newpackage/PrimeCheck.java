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
public class PrimeCheck {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your number: ");
        int x = 1;
        int count = 0;

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(" is prime");
        } else {
            System.out.println(" not prome");
        }
    }
}
