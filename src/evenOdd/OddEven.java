package evenOdd;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = s.nextInt();
        if (n % 2 == 0) {
            System.out.println(" Is a Even");
        } else {
            System.out.println(" Is  a Odd");
        }

    }
}
