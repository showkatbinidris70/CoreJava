/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.p89;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weiht in pounds: ");
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height *METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
        if(bmi < 18.5)
            System.out.println("Underweight");
        else if(bmi <25)
            System.out.println("Normal");
        else if(bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
            
    
}
