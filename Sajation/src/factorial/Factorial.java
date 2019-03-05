package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = scan.nextInt();
        int fact = 1;
        for (int i = a; i > 1; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
