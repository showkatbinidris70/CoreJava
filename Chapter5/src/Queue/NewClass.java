/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int sum = 0;
        for (int i = 0; i >= -1; i++) {
            System.out.print("Enter a number: ");
            int x = input.nextInt();
           
            if (x > 0) {
                sum += x;
            } else {
                break;
            }
            System.out.println(sum);
        }

    }
}
