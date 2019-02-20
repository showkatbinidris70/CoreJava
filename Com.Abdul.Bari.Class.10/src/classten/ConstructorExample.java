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
public class ConstructorExample {
    double d;
    Date date = new Date();
    String s;
//    public ConstructorExample() {
//    }
//    
//
//    public ConstructorExample(double d) {
//        this.d = d;
//    }
//   
    public static void main(String[] args) {
       // ConstructorExample obj = new ConstructorExample();
      ConstructorExample obj = new ConstructorExample();
        System.out.println(obj.date);
        System.out.println(obj.d);
        System.out.println(obj.s);
    }
    
}
