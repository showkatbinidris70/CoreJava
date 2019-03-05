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
public class BiggestNumberFrom3 {

    public static void main(String[] args) {
      //Scanner input = new Scanner(System.in);
     //   System.out.println("Enter your value: ");
      //  isBiggestNumber(input.nextInt(), input.nextInt(), input.nextInt());

    

   // static void isBiggestNumber(int n1, int n2, int n3) {
      int n1 =5;
      int n2 =6;
      int n3 =7;
       
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " biggest");
        } else if (n2 < n1 && n2 > n3) {
            System.out.println(n2 + " biggset");
        } else if (n3 > n1 && n3 > n1) {
            System.out.println(n3 + " biggest");
        } else {
              System.out.println(n1+ " " + n2 + " "+ n3 + " biggest");
        }
      
   }
}
