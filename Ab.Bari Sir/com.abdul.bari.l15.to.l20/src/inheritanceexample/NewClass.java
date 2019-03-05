/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author User
 */
public class NewClass {

    int x, y;
    double d;
    String s;

    int dispSum(int s, int y) {
        return x + y;
    }

    void setx(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        NewClass m = new NewClass();
        m.setx(50);
        //m.dispSum(4, 9);
         m.dispSum(50, 40);
        System.out.println(m);
    }
}
