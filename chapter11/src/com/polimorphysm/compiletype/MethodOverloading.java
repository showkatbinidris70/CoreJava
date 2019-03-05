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
public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;
        obj.demo(10);
        obj.demo(10,20);
        result = obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}
