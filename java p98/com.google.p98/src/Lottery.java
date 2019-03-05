/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Lottery {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter 3 numbers");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double average = (number1+number2+number3)/3;
        System.out.println(number1+number2+number3+average);
    }

}
