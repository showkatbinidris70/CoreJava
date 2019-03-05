package com.coderbd.evidenceExam;

public class ArrayPrintSum {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 9, 3, 7, 10};
        int sum = 0;
        
        System.out.print("Number of array : ");
        for (int i : arr) {
            sum += i;
              System.out.print(i + " ");      
        }         
        System.out.println("\n Sum: " + sum);
    }

}
