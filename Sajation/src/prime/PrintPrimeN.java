package prime;

import java.util.Scanner;

public class PrintPrimeN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int num = 0;

        String primeNumbers = "";
        System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        scan.close();

        for (i = 1; i <= n; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + "  ";
            }
        }
        System.out.println("Prime numbers from 1 to n are : ");
        System.out.println(primeNumbers);
    }

}
