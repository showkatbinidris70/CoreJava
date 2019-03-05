/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author J2EE26
 */
public class doWhileWithString {
    public static void main(String[] args) {
        String a;
        int i=0;
        //String [] ar = new String[5];
        ArrayList al = new ArrayList();
        
        Scanner sc =new Scanner(System.in);
        
        do{
            
            System.out.println("input exit  or X or x for stop the progran");
            a= sc.nextLine();
            
            if(!a.equals("exit") && !a.equals("x") && !a.equals("X")){
            
//                System.out.println("Input 5 string");
//                
//                for(int i=0; i<ar.length; i++){
//                    
//                    ar[i] = sc.nextLine();
//                }
                
                al.add(a);
//                i++;
                
            }
            
            
        }while(!a.equals("exit") && !a.equals("x") && !a.equals("X"));
        
        System.out.println("Your input is:");
                
                for(int c=0; c<al.size(); c++){
                    
                    System.out.println(al.get(c));
                }
    }
    
}


