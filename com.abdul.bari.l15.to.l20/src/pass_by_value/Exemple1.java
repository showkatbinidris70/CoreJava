/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pass_by_value;

/**
 *
 * @author User
 */
public class Exemple1 {

    int data = 50;

    void change(int data) {
        data = data + 100;
        System.out.println("Date in method: " + data);
       
    }

    void changeByObj(Exemple1 e) {
        e.data = 200;
    }

    public static void main(String[] args) {
        Exemple1 ex = new Exemple1();
        System.out.println("Before change: " + ex.data);
        ex.change(55);
        System.out.println("After change by pass by value: " + ex.data);
        ex.changeByObj(ex);
        System.out.println("After change by pass by references: " + ex.data);
    }
}
