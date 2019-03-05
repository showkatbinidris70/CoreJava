/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p82;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GradePint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        double number = input.nextDouble();

        if (number >= 90.0) {
            System.out.println("A+");
        } else if (number >= 80.0) {
            System.out.println("B");
        } else if (number >= 70.0) {
            System.out.println("c");
        } else if (number >= 60.0) {
            System.out.println("D");
        } else {
            System.out.println("f");
        }

    }

}
