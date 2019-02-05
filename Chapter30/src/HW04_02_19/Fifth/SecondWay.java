/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Fifth;

/**
 *
 * @author User
 */
public class SecondWay extends Thread {

    int i = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Thread started running...");

        while (true) {
            System.out.println("Result of i " + i++);
            if (i == 10) {
                break;
            }

        }
    }

}
