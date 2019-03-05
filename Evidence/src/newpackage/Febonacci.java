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
public class Febonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;

        int count = 0;
        System.out.println(a);
        System.out.println(b);

        while (count < 6) {
            c = a + b;
            System.out.println(c + "");
            a = b;
            b = c;
            count++;

        }
        System.out.println();

    }
}
