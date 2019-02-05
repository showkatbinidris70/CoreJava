/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19;

/**
 *
 * @author User
 */
public class HelloRunner implements Runnable {

    int i;

    @Override
    public void run() {
        i = 0;
        while (true) {
            System.out.println("Hello: " + i++);
            if (i == 10) {
                break;
            }
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
        
    }

}
