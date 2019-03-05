/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polimorphysm.compiletype;

/**
 *
 * @author User
 */
public class Overload {
    void demo(int a){
        System.out.println("a: " + a);
    }
    void demo(int a , int b){
        System.out.println("a and b: " + a +"," + b);
    }
    double demo(double a){
        System.out.println("double a:" + a);
        return a * a;
    }
}
