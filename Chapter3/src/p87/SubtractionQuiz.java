/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p87;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        
        if(number1  < number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
        }
        System.out.println("What is  " + number1 + " - " + number2 + "?");
        
        Scanner input = new Scanner (System.in);
        int answer  = input.nextInt();
        if(number1 - number2 == answer){
            System.out.println("you are correct");
        }
        else{
            System.out.println("your answre is wrong");
            System.out.println(number1 + "- "+ number2 + " should be " + (number1 - number2));
        }
    }
}
