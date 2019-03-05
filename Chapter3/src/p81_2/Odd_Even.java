/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p81_2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Odd_Even {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente a number ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        
//        if(score > 90)
//            pay 3* = 1.03;
//        else
//        pay 1* = 1.01;

    }

}
