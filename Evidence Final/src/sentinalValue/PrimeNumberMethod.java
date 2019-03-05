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
public class PrimeNumberMethod {
    // p 216
    
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }
    public static void printPrimeNumbers(int numbrOfPrimes){
    final int NUMBER_OF_PRIMES = 10;
    int count = 0;
    int number = 2;
    while (count < numbrOfPrimes){
    if(inPrime(number)){
    count++;
    if(count % NUMBER_OF_PRIMES == 0){
        System.out.printf("%-5s", number);
    }
    else
            System.out.printf("%-5s", number);
    }
    number++;
    }
    }
    public static boolean inPrime(int number){
        for (int divisor = 2; divisor <= number / 2;  divisor++) {
            if(number % divisor == 0){
            return false;
            }
        }
        return true;
    }
    
}
