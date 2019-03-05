/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p803;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author User
 */
public class TestTreeSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        TreeSet<String> treeSet = new TreeSet<>();

        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());
        System.out.println("headSet(\"New York\"): " + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\"): " + treeSet.tailSet("New York"));

        
        System.out.println("lower(\"p\"): " + treeSet.lower("p"));
        System.out.println("higher(\"P\"): " + treeSet.higher("P"));
        System.out.println("floor(\"p\"): " + treeSet.floor("p"));
        System.out.println("ceiling(\"p\"): " + treeSet.ceiling("p"));
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);

    }
}
