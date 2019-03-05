/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        double radius = input.nextDouble();
        double PI = 3.14159;
        double area = radius * radius * PI;

        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        } else {
            System.out.println("Negative input");
        }
    }

}
