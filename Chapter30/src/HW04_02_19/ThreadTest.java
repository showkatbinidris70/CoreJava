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
public class ThreadTest {

    public static void main(String[] args) {
        HelloRunner r = new HelloRunner();
        Thread t1 = new Thread(r);
        t1.setPriority(1);
        t1.start();

        Thread t2 = new Thread(r);
        // why have  to use (r) here
        t2.start();

        System.out.println("t1.getPriority " + t1.getPriority());
        System.out.println("t2.getPriority " + t2.getPriority());
        System.out.println("t1.getName " + t1.getName());
        System.out.println("t2.getName " + t2.getName());
        
        // it has been infinity loop. But why?

    }

}
