/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stactk.bosta;

import stactk.p741.GenericStack;

/**
 *
 * @author User
 */
public class TestBosta {

    public static void main(String[] args) {
        GenericStack<Bosta> bostaList = new GenericStack<>();
        System.out.println("Now Size : " + bostaList.getSize());
        bostaList.push(new Bosta(100, "50 KG"));
        bostaList.push(new Bosta(110, "60 KG"));
        bostaList.push(new Bosta(120, "70 KG"));
        System.out.println("Size: " + bostaList.getSize());
        System.out.println("peek: " + bostaList.peek());
        System.out.println("Size: " + bostaList.getSize());
        System.out.println("pop: " + bostaList.pop());

    }

}
