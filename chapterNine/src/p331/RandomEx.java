/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p331;

import java.util.Random;

/**
 *
 * @author User
 */
public class RandomEx {
    public static void main(String[] args) {
        Random random1 = new Random();
        System.out.println("From random1");
        for (int i = 0; i < 10; i++) {
            System.out.println(random1.nextInt(1000) + " ");
        }
        Random random2 = new Random( );
        System.out.println("From random2");
        for (int i = 0; i < 10; i++) {
            System.out.println(random2.nextInt(1000) + " ");
        }
    }
    
}
