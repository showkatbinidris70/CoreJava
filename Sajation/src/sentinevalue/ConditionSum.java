package sentinevalue;

import java.util.Scanner;

public class ConditionSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i >= -1; i++) {
            System.out.print("Enter the value of : ");
            int x = scan.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
            System.out.println("Sum result is : " + sum);
        }

    }
}
