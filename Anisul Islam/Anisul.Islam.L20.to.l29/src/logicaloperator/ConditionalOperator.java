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
public class ConditionalOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, large;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Enter 2 numbers");
        large = (num1 > num2) ? num1 : num2;
        System.out.println("Large number: " + large);
    }

}
