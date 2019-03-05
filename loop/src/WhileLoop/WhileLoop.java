/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoop;

/**
 *
 * @author User
 */
public class WhileLoop {
   
    public static void printFirstNumToSecondNum(int num1, int num2){
    while (num1 <= num2){
        System.out.println(num1);
        num1++;
    
    }
    }
     public static int makeSumFromFirstNumToSecondNum(int num1, int num2){
         int sum = 0;     
    while (num1 <= num2){
        sum+= num1;
         num1++;  
    }
    return sum;
    }
    
    
}
