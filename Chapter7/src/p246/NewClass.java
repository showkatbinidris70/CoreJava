/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p246;

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i - 1];
           // System.out.println(i);
        }
         
        for (int i = 0; i < list.length; i++) {
           System.out.print(list[i] + " ");
        }
    }
}
