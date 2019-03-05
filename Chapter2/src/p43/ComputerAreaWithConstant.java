/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p43;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputerAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");

        double radius = input.nextDouble();

        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius "  + area + radius + "is" + area);
    }

}
