package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortOneDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of value : ");
        int arraySize = sc.nextInt();
        Integer[] arr = new Integer[arraySize];

        
        //Descending
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

    }
}
