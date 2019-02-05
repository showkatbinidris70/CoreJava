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
public class App {

    public static void main(String[] args) {
        new TestThreadYield("Thread 1");
        new TestThreadYield("Thread 2");
        new TestThreadYield("Thread 3");
        new TestThreadYield("Thread 4");
        new TestThreadYield("Thread 5");
    }

}
