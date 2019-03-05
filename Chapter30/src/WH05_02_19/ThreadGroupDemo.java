/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WH05_02_19;

/**
 *
 * @author User
 */
public class ThreadGroupDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("parent threadgroup");

        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, t1, "Two");
        t2.start();
        Thread t3 = new Thread(tg1, t2, "Three");
        t3.start();

        System.out.println("Thread group name:  " + tg1.getName());
        tg1.list();
    }
}
