/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = input.nextLine();
        
        int low = 0;
        int high = s.length()-1;
        boolean isPalindrome = true;
        
        while(low < high){
        if(s.charAt(low) != s.charAt(high));
        isPalindrome = false;
        break;
        }
        low ++;
        high --;
        
        if(isPalindrome)
            System.out.println( s + " is a palindrome");
        else
            System.out.println( s + " not a palindrome");
    }
}
