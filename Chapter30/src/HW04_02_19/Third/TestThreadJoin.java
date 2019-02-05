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
public class TestThreadJoin {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        
        // Why have to use (new MyRunnable(), "t1");
        t1.start();

        try {
            t1.join(3000);
        } catch (Exception e) {
        }
        t2.start();;
        t2.join(5000);

        t3.start();

        t1.join();
        t2.join();
        t3.join();
        System.out.println("All thread are dead, executing main thread");
    }
}
