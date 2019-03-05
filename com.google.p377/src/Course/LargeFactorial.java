/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }
    public static BigInteger factorial(long n){
    BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) 
            result = result.multiply(new BigInteger(i + ""));
            return result;
        
    }
}
