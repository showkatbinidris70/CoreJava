/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorldSix;

/**
 *
 * @author User
 */
public class HelloWorldsix {
    public static void main(String[] args) {
        System.out.println(sayHello("Hello", " World"));
       // System.out.println(5, 10);
    }
    public static String sayHello(String msg1, String msg2){
    String message = msg1 + msg2;
    return message;
    
    }
    public static int addition(int n1, int n2){
    int rs = n1 + n2;
    return rs;
    }
    
}
