/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasic253;

/**
 *
 * @author User
 */
public class AnalyzingNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter teh number of items");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;
        System.out.println("Enter teh numbers : ");
        for (int i = 0; i < n; i++){
        numbers[i] = input.nextDouble();
        sum += numbers[i];
        }
        double average = sum / n;
        int count = 0 ;
        for(int i = 0; i < n; i++)
            if(numbers[i] > average)
                count++;
        System.out.println("Average is  " + average);
        System.out.println("Number of  elements above the average is " + count);
    }
    
}
