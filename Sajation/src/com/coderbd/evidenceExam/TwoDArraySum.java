package com.coderbd.evidenceExam;

public class TwoDArraySum {

    public static void main(String[] args) {
        int[][] twoD = {
            {2, 8, 6},
            {1, 5, 9}
        };
        int sum = 0;
        
        System.out.println("Print 2D Array : ");
        for (int[] oneD : twoD) {
            for (int i : oneD) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
