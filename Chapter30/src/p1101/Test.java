/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1101;

/**
 *
 * @author User
 */
public class Test implements Runnable {

    public static void main(String[] args) {
        //new Test();
        // System.out.println(Test);
        Test test = new Test();
        System.out.println(test);
    }

    public Test() {
        Test test = new Test();
        new Thread(test).start();
    }

    @Override
    public void run() {
        System.out.println("Test");
    }
}
