package passFail;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your obtained number : ");
        int i = input.nextInt();

        switch ((i / 10) * 10) {
            case 90:
                System.out.println("Grade is A");
                break;
            case 80:
                System.out.println("Grade is B");
                break;
            case 70:
                System.out.println("Grade is C");
                break;
            case 60:
                System.out.println("Grade is D");
                break;
            case 50:
                System.out.println("Grade is E");
                break;
            default:
                System.out.println("Grade is F");

        }

    }

}
