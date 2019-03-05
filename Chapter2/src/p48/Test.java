/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p48;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
//        int x = 100;
//        int y = 2;
//        int z = 7;
//        int Tues = (x + y) % 7;
//        System.out.println(Tues + " So it is Tuesday !");

Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        System.out.println("The area the circle of radius" + radius + " is "+ area);
       
    }

}
