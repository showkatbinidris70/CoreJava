/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1099;

/**
 *
 * @author User
 */
public class Clint {

    public void someMethod() {

        TastClass task = new TastClass();

        Thread thread = new Thread(task);
       
         thread.start();

    }
}
