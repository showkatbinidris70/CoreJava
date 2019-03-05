/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sum1to10ButOdd {

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 10; i+=2) {
            sum+=i;
            System.out.println(sum);
        }
       
    }
}
