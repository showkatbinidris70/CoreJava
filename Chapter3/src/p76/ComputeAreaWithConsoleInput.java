/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p76;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
 
        double radius = input.nextDouble();
        double area;
        if(radius < 0){
            System.out.println("Incorrect input");
        }else{
        area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }
        
//double radius = 1;
//        System.out.println(radius < 0);
    }
            
    
}
