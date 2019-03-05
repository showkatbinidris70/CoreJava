package fibonacci;

import java.util.Scanner;

public class Fibonacci1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int x = input.nextInt();
        
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);

        int count = 0;
        while (count <= x) {
            c = a + b;
            System.out.print("  " + c);
            a = b;
            b = c;
            count++;
        }
        System.out.println();
    }
}
