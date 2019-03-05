/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

/**
 *
 * @author User
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("Sum " + sum);
        }
    }

}
