/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q63;

/**
 *
 * @author User
 */
public class KungFu {

    public static void main(String[] args) {
        Integer x = 400;
        Integer y = x;
        x++;
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1;
        sb1.append("5");
        System.out.println((x == y) + " " + (sb1 == sb2));
    }
}
