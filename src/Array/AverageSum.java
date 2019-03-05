
package Array;

import java.util.Scanner;


public class AverageSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] number = new double[6];
        double sum = 0;
        System.out.print("Please enter numbers : ");
        
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }

        System.out.println("The sum is : " + sum);
        double avg = sum / number.length;
        System.out.println("The average is : " + avg);
    }
}
