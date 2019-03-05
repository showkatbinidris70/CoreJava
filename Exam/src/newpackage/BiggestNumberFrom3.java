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
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your number: ");
//        isBiggestNumber(input.nextInt(), input.nextInt(), input.nextInt());
//    }

        int n1 = 5;
        int n2 = 8;
        int n3 = 3;
        // static void isBiggestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is biggest");
        } else if (n2 < n1 && n2 > n3) {
            System.out.println(n2 + " is biggest");
        } else if (n3 > n1 && n3 > n1) {
            System.out.println(n3 + " is biggest");
        } else {
            System.out.println(n1 + " " + n2 + " " + n3 + " all are equals");
        }
    }

}
