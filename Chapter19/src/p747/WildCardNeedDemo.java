/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p747;

import static jdk.nashorn.internal.objects.NativeMath.max;
import stactk.p741.GenericStack;

/**
 *
 * @author User
 */
public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        System.out.println("The max number is " + max(intStack));
    }

    public static double max(GenericStack<Integer> stack) {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if (value < max) {
                max = value;
            }
        }
        return max;
    }

}
