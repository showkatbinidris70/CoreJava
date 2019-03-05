/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stactk.p741;

/**
 *
 * @author User
 */
public class TestSlass {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        //  System.out.println("country " + stack1.getSize());
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");
        System.out.println("country " + stack1.getSize());
        System.out.println("peek " + stack1.peek());
        System.out.println("pop " + stack1.pop());
        System.out.println("country " + stack1.getSize());

        GenericStack<Integer> stack2 = new GenericStack<>();
        System.out.println("number" + stack2.getSize());
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

    }

}
