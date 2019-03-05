package com.coderbd.string;

public class Palindrom {

    public static void main(String[] args) {

        String s1 = "mdam";
        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            System.out.println("Is palindrom");
        } else {
            System.out.println("Not a palindrom");
        }
    }
}
