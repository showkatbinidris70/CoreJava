package com.coderbd.evidenceExam;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = s.nextInt();
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(" Is Prime number");
        } else {
            System.out.println("Not a Prime number");
        }
    }
}
