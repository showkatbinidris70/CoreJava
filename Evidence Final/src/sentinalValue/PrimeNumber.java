/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentinalValue;

/**
 *
 * @author User
 */
public class PrimeNumber {
    
    public static void main(String[] args) {
        final int Number_OF_PRIME = 20;
        final int NUMBER_OF_PRIME_PER_LINE = 10;
        
        int count = 0;
        int number = 2;
        System.out.println("The first 50 prime numbers are \n");
        while(count < Number_OF_PRIME){
        boolean isPrime = true;
            for (int divisor = 2; divisor <= number; divisor++) {
                if(number % divisor == 0){
                isPrime = false;
                break;
                }
            }
            if(isPrime){
            count++;
            if(count % NUMBER_OF_PRIME_PER_LINE == 0){
                System.out.println(number);
            }
            else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
    
}
