package prime;

import java.util.Scanner;

public class printPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int num = 0;
        String primeNumbers = " ";

        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        input.close();

        for (i = 1; i <= n; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count += 1;
                }
            }

            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }

        System.out.println("PrimeNumbers from 1 to n are : ");
        System.out.println(primeNumbers);
    }
}
