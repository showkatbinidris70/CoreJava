package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Is palindrom");
        } else {
            System.out.println("Not a palindrom");
        }
    }
}
