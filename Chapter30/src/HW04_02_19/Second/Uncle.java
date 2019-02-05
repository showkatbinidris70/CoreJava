/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Second;



/**
 *
 * @author User
 */
public class Uncle implements Runnable{
    int i=0;
    @Override
    public void run() {
       while(true){
           System.out.println("uncle : " + i++);
           if(i == 50){
           break;
           }
           try {
               Thread.sleep(10);
           } catch (Exception e) {
           }
       }
    }

   
    
}
