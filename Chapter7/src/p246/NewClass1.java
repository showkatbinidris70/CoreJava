/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p246;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0;; i++) {
            System.out.println("Enter Number");
            int x = scan.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
