/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        WhileLoop.printFirstNumToSecondNum(1,10);
        System.out.println("Sum:" + WhileLoop.makeSumFromFirstNumToSecondNum(1, 10));
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n1 = 0;
        while (true){
            System.out.println("Enter Frist Number"+ n1 +"Time");
            int num1 = sc.nextInt();
            if(num1 != -1){
            sum +=num1;
                System.out.println("Sum: "+ sum);
                n1 ++;
            }else{
            break;
            }
        }
    }
    
}
