/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p712;

/**
 *
 * @author User
 */
public class TestA {

    public static void main(String[] args) {
        xMethod(5);
    }

    public static void xMethod(int n) {
        if (n > 0) {
            System.out.println(n);
            xMethod(n - 1);
        }

    }

}
