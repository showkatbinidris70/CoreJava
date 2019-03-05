
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author l2pc206m
 */
public class ThreadRunnable implements Runnable{
   
    public void run() {
       
        for(int i=0; i<100000; i++){
            System.out.println("Dhaka IS A BIG CITY IN BANGLADESH");
            
        }
    }
}
