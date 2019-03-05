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
public class ImprovedFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for the Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("Fibonacci number at index " + index + " is" + fib(index));
    }

    public static long fib(long n) {
        long f0 = 0;
        long f1 = 1;
        long f2 = 1;

        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else if (n == 2) {
            return f2;
        }

        for (int i = 3; i <= n; i++) {
            f0 = f1;
            f1 = f2;
            f2 = f0 + f1;
        }
        return f2;
    }
}
