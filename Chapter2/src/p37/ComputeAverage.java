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
public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        double avarage = (num1+ num2+ num3) / 3;
        System.out.println(avarage);
    }
    
}
