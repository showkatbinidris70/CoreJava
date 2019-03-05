/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p123;

/**
 *
 * @author User
 */
public class p128 {

    public static void main(String[] args) {
        char ch = 'A' + 'Z' + '0';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric character");
        }

    }

}
