/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classten;

import java.util.Date;

/**
 *
 * @author User
 */
public class FieldInitialazationExample {
    double d = 10.00;
    Date date = new Date();
    String s = "Showkat";

    public FieldInitialazationExample(String s) {
        this.s = s;
    }
    
    public static void main(String[] args) {
      FieldInitialazationExample obj = new FieldInitialazationExample("Hello");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
}
