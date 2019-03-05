
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = input.next();

        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = true;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
