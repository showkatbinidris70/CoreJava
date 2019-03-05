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
public class Demo {

    public static void main(String[] args) {
        //  elementType [] arrayRefVar;

        double[] myList = new double[10];

        //  arrayRefVar = new elementType[arraySize];
        //   elementType  arrayRefVar [] = new elementType[arraySize];
        //  myList [0] = 5.6;
        // myList[0] = myList[1] = myList[2] = myList[3] = myList[4] = myList[5] = myList[6] = myList[7] = myList[8];
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = i;
//
//            System.out.println(i);
//        }
//        
//        double [] my = new double [4];
//        my[0] = 1.9;
        // char [] de = {'S', 'h', 'o', 'w', 'k', 'a','t'};
//       for (int i = 0; i < de.length; i++) {
//        //   de [i] = i;
//            System.out.println(i);
//        
//       }
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//            System.out.println(i);
//        }
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                 System.out.println(i);
            }
           
        }
    }

}
