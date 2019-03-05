/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p799;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);
        for (String s : set) {
            System.out.println(s.toUpperCase()+ " ");
        }
    }
}
