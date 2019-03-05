/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperator;

/**
 *
 * @author User
 */
public class MathDemo {

    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int max = Math.max(x, y);
        System.out.println("Max number:" + max);
        int min = Math.min(x, y);
        System.out.println("Min number:" + min);

        int absolute = Math.abs(y);
        System.out.println("Absolute number:" + absolute);

        double power = Math.pow(x, y);
        System.out.println("x to the power y = :" + power);

    }

}
