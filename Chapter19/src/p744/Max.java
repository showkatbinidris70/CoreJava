/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p744;

/**
 *
 * @author User
 */
public class Max {
    public static Comparable max(Comparable o1, Comparable o2) {
        if(o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;
    }
    public static void main(String[] args) {
        Max m = new Max();
        System.out.println(m);
    }
}
