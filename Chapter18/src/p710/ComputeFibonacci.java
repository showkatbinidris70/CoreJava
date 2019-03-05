/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p710;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for a Fibonacci number:");
        int index = input.nextInt();
        System.out.println("The Fibonacci numbr at index" + index + " is " + fib(index));
    }

    public static long fib(long index) {
        if (index == 0) 
            return 0;
         else if (index == 1) 
            return 1;
         else 
            return fib(index - 1) + fib(index - 2);
        
    }
}
