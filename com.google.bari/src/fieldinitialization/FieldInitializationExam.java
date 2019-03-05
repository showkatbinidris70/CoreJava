/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldinitialization;

import java.util.Date;

/**
 *
 * @author User
 */
public class FieldInitializationExam {
    double d;
    Date date = new Date();
    String s;

    public FieldInitializationExam(String s) {
        this.s = s;
    }
   
    public static void main(String[] args) {
      FieldInitializationExam obj = new FieldInitializationExam("Hello");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
}
