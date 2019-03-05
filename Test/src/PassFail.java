
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
public class PassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number: ");
        int score = input.nextInt();
        int x = 0;
        if(score >= 80){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }
    }
    
}
