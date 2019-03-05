/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance2;

/**
 *
 * @author User
 */
public class B extends A{
    public void sayHello(){
        System.out.println("Ghom from B");
    }
    public void sayHi(){
        super.sayHello();
        System.out.println("Hi,Shouvo , I am from B class, sayHi Hethod");
    }
    
}
