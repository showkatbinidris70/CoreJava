
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class TwoDArraySort {

    public static void main(String[] args) {
        int sum = 0;
        int[][] data = {
            {14, 52, 36, 20, 40},
            {14, 52, 36, 20, 40},
            {14, 52, 36, 20, 40},
            {14, 52, 36, 20, 40}

        };
        System.out.println("Data Table");

        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a);
                sum += a;
            }

        }
        System.out.println(sum);
    }
}
