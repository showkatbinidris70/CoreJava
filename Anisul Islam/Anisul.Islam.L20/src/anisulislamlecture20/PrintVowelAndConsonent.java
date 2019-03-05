/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamlecture20;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PrintVowelAndConsonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter your character: ");
        ch = input.next().charAt(0);
        if (ch == 'a') {
            System.out.println("vowel");
        } else if (ch == 'e') {
            System.out.println("vowel");
        } else if (ch == 'i') {
            System.out.println("vowel");
        } else if (ch == 'o') {
            System.out.println("vowel");
        } else if (ch == 'u') {
            System.out.println("vowel");
        }else if (ch == 'A') {
            System.out.println("vowel");
        } else if (ch == 'E') {
            System.out.println("vowel");
        } else if (ch == 'I') {
            System.out.println("vowel");
        } else if (ch == 'O') {
            System.out.println("vowel");
        } else if (ch == 'U') {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonent");
        }
    }

}
