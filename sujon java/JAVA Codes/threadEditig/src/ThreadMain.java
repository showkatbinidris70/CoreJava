
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**0
 *
 * @author l2pc206m
 */
public class ThreadMain{

    public static void main(String[] args){
        Thread t1 = new Thread(new ThreadRunnable());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
