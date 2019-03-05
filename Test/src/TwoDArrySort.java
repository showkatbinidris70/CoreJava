
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
public class TwoDArrySort {

    public static void main(String[] args) {
        int[][] data = {
            {2, 3, 4, 6},
            {2, 4, 4, 6},
            {3, 3, 1, 0},
            {2, 9, 4, 6}
        };
        System.out.println("Data Table");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.println(a + " ,");
            }
            System.out.println();
        }
    }
}
