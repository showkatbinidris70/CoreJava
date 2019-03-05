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
public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your numebr");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println(" is an even number");
        } else {
            System.out.println(" ia an  odd number");
        }
    }

}
