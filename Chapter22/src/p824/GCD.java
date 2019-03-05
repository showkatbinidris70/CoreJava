/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p824;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int m = input.nextInt();
        System.out.println("Enter second integer: ");
        int n = input.nextInt();

        System.out.println("The greatest common divisor for " + m + " and " + n + " is " + gcd(m, n));
    }

    public static int gcd(int m, int n) {
        int gcd = 1;

        if (m % n == 0) {
            return n;
        }

        for (int k = n / 2; k >= 1; k--) {
            if (m % k == 0 && n % k == 0) {
                gcd = k;
                break;
            }
        }
        return gcd;
    }

}
