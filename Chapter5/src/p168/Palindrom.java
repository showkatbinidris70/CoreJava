/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p168;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrom {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String s = input.nextLine();
        
        int low = 0;
        int high = s.length()-1;
        boolean isPalimdrome = true;
        
        while(low < high){
        if(s.charAt(low) != s.charAt(high)){
        isPalimdrome = false;
        break;
        }
        low++;
        high++;
        
        }
        if(isPalimdrome)
            System.out.println(s + "");
        
    }
}
