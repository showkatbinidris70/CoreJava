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
public class CapitalSmall {

    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("small");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("captial");
        } else {
            System.out.println("Not a letter");
        }
    }

}
