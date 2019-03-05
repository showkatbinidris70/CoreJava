

import java.util.Scanner;


public class MaxMin {

    public static void main(String[] args) {
        System.out.println("Enter the value of length");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int a[] = new int[length];
        int max = 0;
        int min = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the value");
            a[i] = scan.nextInt();
            // System.out.println(a[i]);
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            } else {
                continue;
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        //System.out.println(Math.pow(3, 3));
    }
}
