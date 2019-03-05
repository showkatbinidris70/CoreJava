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
public class EmailValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Eamil: ");

        String email = input.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");

        if (atpos > 0 && dotpos < email.length() - 1 && atpos < dotpos) {
            System.out.println("Eamil is valid");
        } else {
            System.out.println("Eamil is invalid");
        }

    }
}
