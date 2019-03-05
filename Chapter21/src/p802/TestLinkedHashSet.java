/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p802;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class TestLinkedHashSet {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println(set);
        for (Object element : set) {
            System.out.println(element.toString().toLowerCase() + " ");
        }
    }
}
