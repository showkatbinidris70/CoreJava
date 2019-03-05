/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p37;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.println("Enter your number");
        double radius = input.nextDouble();
       double man =radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius + " is " + man);
      
    }

}
