/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.computetax.p98;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits) : ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        
        System.out.println("The lottery number is " + lottery);
        
        
        if(guess == lottery)
            System.out.println("Exact match: you win $10000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == guessDigit2)
            System.out.println("Match all digits : you win $3000");
        else if(guessDigit1 == lotteryDigit1
             || guessDigit1 == lotteryDigit2
             || guessDigit2 == lotteryDigit1
             || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit : you win $1000");
        else if(guessDigit1 != lotteryDigit2)
            System.out.println("You will have to pay $1000");
        else
            System.out.println("Sorry, n match");
        
            
            
        
    }
    
}