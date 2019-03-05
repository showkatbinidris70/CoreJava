/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p246;

/**
 *
 * @author User
 */
public class Output {

    public static void main(String[] args) {
//        int x = 30;
//        int[] numbers = new int[x];
//        x = 60;
//        System.out.println("x is " + x);
//        System.out.println("The size of numbers is " + numbers.length);
//        double [] list = new double[10];
//        double sum = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum+= list[i];
//           System.out.println(i);
//        }

        double [] list = new double[5];
        for (int i = list.length -1; i > 0; i--) {
            int j = (int)(Math.random() * (i +1));
            
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            
            System.out.println(j);
        }
    }
}
