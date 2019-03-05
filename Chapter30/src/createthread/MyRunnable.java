/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createthread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MyRunnable extends Thread{
     @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("Sum " + sum);
        }
    }
    
         try {
         try {
             this.wait();
         } catch (InterruptedException ex) {
             Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
         }
         } catch (InterruptedException ex) {
             Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
         }
}
}
