/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperator;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter any digit: ");
         int digit;
        digit = input.nextInt();
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Not a digit");
        }
    }

}
