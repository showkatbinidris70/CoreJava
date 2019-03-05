/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.p47;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for minutes: ");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println ( minutes + " houres is " + hours + " hours and " + remainingMinutes + "Minutes");
    }
    
}
