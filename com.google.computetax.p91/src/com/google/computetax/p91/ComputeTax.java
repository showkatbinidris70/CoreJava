/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.computetax.p91;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("(0-single filer, 1-married jointly or " + " qualifying window(er), 2-married separately, 3-head of " + " household) Enter the filing status:");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        if(status == 0)
            if(income <= 16700)
            tax = income * 0.10;
            else if(income <= 67900)
                tax = 16700 * 0.10 +(income-16700) * 0.15;
            else if(income <= 137050)
                tax = 16700 * 0.10 + (income-16700) * 0.15 +(income -67900)* 0.25;
            else if (income <=208850)
                 tax = 16700 * 0.10 + (income-16700) * 0.15 +(income -67900)* 0.25;
        
         
    }
    
}
