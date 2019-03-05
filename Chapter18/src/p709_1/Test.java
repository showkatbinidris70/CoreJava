/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p709_1;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        //   int n = 5;
        System.out.println(xMethod(5));
    }

    public static int xMethod(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + xMethod(n - 1);
        }
    }

}
