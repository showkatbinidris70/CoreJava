/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        System.out.println(a);
        System.out.println(b);

        int count = 0;
        while (count < 5) {

            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            count++;
        }
    }
}
