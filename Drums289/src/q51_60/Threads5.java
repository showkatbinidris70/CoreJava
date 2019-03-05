/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q51_60;

/**
 *
 * @author User
 */
public class Threads5 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.print("bar");
            }
        }).start();
    }

}
