
package Array;

import java.util.Arrays;


public class SortingArray {
    public static void main(String[] args) {
        int[] number = {10, 3, 18, 5, 25, 4, 13};
        Arrays.sort(number);
      
        //Ascending number
        System.out.print("Ascending number : ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" " + number[i] + " ");                  
        }
        System.out.println();
        
        //Descending number
        System.out.print("Descending number : ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(" " + number[i] + " ");
        }
        System.out.println();
        
        
        
        String[] names = {"Motin", "Robin", "Babu", "Habib"};
        Arrays.sort(names);
        System.out.print("String array ascending : ");
        for (int i = 0; i < 4; i++) {
            System.out.print(names[i] + " ");           
        }
        System.out.println();
        
        System.out.print("Descending string array : ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}
