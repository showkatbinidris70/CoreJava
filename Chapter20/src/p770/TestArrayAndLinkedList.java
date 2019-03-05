/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p770;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author User
 */
public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);
        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println("Display the linked list forward:");
        System.out.println(linkedList);
        
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.next() + " ");
        }
         System.out.println();
        System.out.println("Dispaly the linked list backward:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " ");
            
        }
    }

}
