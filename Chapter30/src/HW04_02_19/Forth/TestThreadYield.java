/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Forth;

/**
 *
 * @author User
 */
public class TestThreadYield implements Runnable{
    Thread t;
    // What happen here
    TestThreadYield(String str){
        t = new Thread(this,str);
                t.start();
      //What happen here?
    }
    
    
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%5 == 0){
                System.out.println(Thread.currentThread().getName()+ " yielding controle...");
                    //what is this>(Thread.currentThread().getName()
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+" has finished executiong...");
    }
    
}
