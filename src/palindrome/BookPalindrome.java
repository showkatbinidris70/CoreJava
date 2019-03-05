package palindrome;

import java.util.Scanner;

public class BookPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string value : ");
        String s = input.nextLine();
        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}
