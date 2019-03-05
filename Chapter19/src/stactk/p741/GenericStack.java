/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stactk.p741;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GenericStack <E>{
    private ArrayList<E> list = new ArrayList<>();
    public int getSize(){
    return list.size();
    }
    public E peek(){
    return list.get(getSize()-1);
    }
    public void push(E o){
    list.add(o);
    }
    public E pop(){
    E o = list.get(getSize()-1);
    list.remove(getSize()-1);
    return o;
    }
    public boolean isEmpty(){
    return list.isEmpty();
    }

    @Override
    public String toString() {
        return "GenericStack{" + "list=" + list + '}';
    }

    
    
}
