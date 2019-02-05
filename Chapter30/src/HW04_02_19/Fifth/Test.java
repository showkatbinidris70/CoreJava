/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Fifth;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        Thread t = new SecondWay();
        t.start();

        Thread tt = new SecondWay();
        tt.start();
        System.out.println("tt: " + tt.getName());
    }
}
