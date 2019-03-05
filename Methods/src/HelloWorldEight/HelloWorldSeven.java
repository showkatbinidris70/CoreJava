/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorldEight;

import HelloWorldSeven.*;

/**
 *
 * @author User
 */
public class HelloWorldSeven{
    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello());
    }
    public static String sayHello(){
    return HelloWorldSix.sayHello("Hello", " World" );
            
    }
    public static String sayHelloo(){
        String msg = HelloWorldSix.sayHello("Hello", " World");
   
    return msg;
    }
    
}
