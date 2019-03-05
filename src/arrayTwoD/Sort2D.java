package arrayTwoD;

import java.util.Arrays;

public class Sort2D {

    public static void main(String[] args) {
        System.out.println("2D array Sorting : ");
        defaultSort();
    }

    public static void defaultSort() {
        int[][] num = {
            {4, 5, 8, 24, 6, 1},
            {2, 5, 8, 7, 18, 1},
            {4, 12, 8, 7, 6, 1},};
        
        //Ascending
        for (int[] oneD : num) {
            Arrays.sort(oneD);
            for (int i : oneD) {
                System.out.print(i + " , ");
            }
            System.out.println();
        }
    }
}
