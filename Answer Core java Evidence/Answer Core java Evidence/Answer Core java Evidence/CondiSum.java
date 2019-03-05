/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CondiSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for (int i = 0; ; i++) {
            System.out.println("Enter Number");
          int x = scan.nextInt();
          if(x>0){
          sum+=x;
          }
          else
              break;
        }
        System.out.println(sum);
    }
}
