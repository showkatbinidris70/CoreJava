/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WH05_02_19Third;

/**
 *
 * @author User
 */
public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (start) message = " + message);
        processmessage();
        System.out.println(Thread.currentThread().getName() + "end");
    }

    public void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
