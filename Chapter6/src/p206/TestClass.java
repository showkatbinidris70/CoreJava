/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p206;

/**
 *
 * @author User
 */
public class TestClass {

    public static void main(String args[]) {
//                int i; 
//                for(i = 1; i <=6; i++){ 
//                      //  if(i >=3) continue ; 
//                    System.out.println(i);   
//                }
//              //   System.out.println(i);  

        int i = 0, j = 5;
        for (; (i< 3) && (j++ < 10); i++) {
            System.out.println( " " + i);
        }
      //  System.out.println(" " + i + " " + j);
    }

}
