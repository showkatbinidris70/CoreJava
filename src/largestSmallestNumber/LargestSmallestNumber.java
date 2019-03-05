package largestSmallestNumber;

import java.util.Scanner;

public class LargestSmallestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        isLargestNumber(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println("\n");
        System.out.print("Enter the value of : ");
        isSmallestNumber(scan.nextInt(), scan.nextInt(), scan.nextInt());
    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println("Largest number is : " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("Largest number is : " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("Largest number is : " + n3);
        } else {
            System.out.println(n1 + "  " + n2 + "  " + n3 + "  " + "all are equals");
        }
    } 
  

    static void isSmallestNumber(int x1, int x2, int x3) {
        if (x1 < x2 && x1 < x3) {
            System.out.println("Smallest number is : " + x1);
        } else if (x2 < x1 && x2 < x3) {
            System.out.println("Smallest number is : " + x2);
        } else if (x3 < x1 && x3 < x2) {
            System.out.println("Smallest number is : " + x3);
        } else {
            System.out.println(x1 + "  " + x2 + "  " + x3 + "  " + "all are equals");
        }
    }
}
