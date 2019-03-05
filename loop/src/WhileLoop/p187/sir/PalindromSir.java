/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoop.p187.sir;

/**
 *
 * @author User
 */
public class PalindromSir {
    public static void main(String[] args) {
        System.out.println(PalindromEx.isPalinDrom("moam"));
        
    }
    public static boolean isPalinDrom(String s){
    boolean PalinDrom = false;
    if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())){
    PalinDrom = true;
    
    }
    return PalinDrom;
    }
    
    
}
