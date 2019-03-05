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
public class BiggestNumberFrom3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        isBiggetNumber(input.nextInt(), input.nextInt(), input.nextInt());
    }

    static void isBiggetNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " is biggest");
        } else if (n2 < n1 && n2 > n3) {
            System.out.println(n2 + " is biggset");
        } else if (n3 > n1 && n3 > n1) {
            System.out.println(n3 + " is biggest");
        } else {
            System.out.println("All are equals");
        }
    }
}
