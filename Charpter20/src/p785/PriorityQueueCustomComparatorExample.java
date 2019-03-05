/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p785;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class PriorityQueueCustomComparatorExample {

    public static void main(String[] args) {
        Comparator<String> stringLengthComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>(stringLengthComparator);
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
        }
    }

}
