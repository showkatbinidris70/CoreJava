package com.coderbd.evidenceExam;

import java.util.Scanner;

public class CondiSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i >= -1; i++) {
            System.out.print("Enter Number : ");
            int x = scan.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
            System.out.println(sum);
        }
    }
}
