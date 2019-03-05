package com.coderbd.evidenceExam;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value : ");
        
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println("This is Even number");
        } else {
            System.out.println("This is Odd number");
        }

    }
}
