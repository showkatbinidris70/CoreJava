/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p79;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 5 == 0)
             System.out.println("Hi Five");
       
           
        if(number % 2 == 0)
        System.out.println("Hi Even");
        
    }
            
    }
    

