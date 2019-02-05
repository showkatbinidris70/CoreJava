/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Third;

/**
 *
 * @author User
 */
public class MyRunnable implements Runnable {



    @Override
    public void run() {
        System.out.println(" Thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            
        }
        System.out.println("Thread ending: " + Thread.currentThread().getName());
    }
}
