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
public class LargestNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers ");;
        isLargestNumber(input.nextInt(), input.nextInt(), input.nextInt());
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largeset number");
        } else if (n2 < n1 && n2 > n3) {
            System.out.println(n2 + " is largest number");
        } else if (n3 > n1 && n3 > n1) {
            System.out.println(n3 + " is largest number");
        } else {
            System.out.println(n1 + ", " + n2 + ", " + n3 + " are all equal Numbers");
        }
    }

}
