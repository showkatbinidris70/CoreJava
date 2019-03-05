package prime;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the value : ");
        int x = number.nextInt();
        
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Is a prime");
        } else {
            System.out.println("Not a prime");
        }
    }
}
