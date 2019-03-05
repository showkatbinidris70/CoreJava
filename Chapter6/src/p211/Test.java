/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p211;

/**
 *
 * @author User
 */
public class Test {
//     public static void main(String[] args) {  
//         nPrintln( "Welcome to Java!", 5);  
//     }  
//     public static void nPrintln(String message, int n) {  
//         
//              n = 1;  
//             for (int i = 0; i < n; i++) 
//        System.out.println(n); 
//     }
//    

    public static void main(String[] args) {
        int max = 0;
        max(1, 2, max);
        System.out.println(max);
    }

    public static void max(int value1, int value2, int max) {
        if (value1 > value2) {
            max = value1;
        } else {
            max = value2;
        }
    }
}
