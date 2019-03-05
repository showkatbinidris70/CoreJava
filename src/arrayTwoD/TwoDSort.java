
package arrayTwoD;

import java.util.Arrays;


public class TwoDSort {
    public static void main(String[] args) {
        System.out.println("Two D Array sorting : ");
        defaultSort();
    }
    //Ascending
    public static void defaultSort(){
    int [][] num ={
        {5, 9, 7, 4, 11},
        {4, 8, 0, 3, 15},
        {17, 9, 6, 2, 1}
    };
         for (int[] oneD : num) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + ", ");
            }
            System.out.println();

        }
    
    }
}
