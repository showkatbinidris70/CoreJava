/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p707;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int n = input.nextInt();
        System.out.println("factorial of " + n + " is " + factorial(n));
        
    }
    public static long factorial(int n){
    if(n==0)
        return 1;
    else
        return n * factorial(n-1);
    }
}
