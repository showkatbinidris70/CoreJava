
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
public class TwoDArraySum {

    public static void main(String[] args) {
        int sum = 0;
        int[][] data = {
            {5, 6, 8, 9},
            {5, 6, 8, 9},
            {5, 6, 8, 9},
            {5, 6, 8, 9},};
        System.out.println("Data table");
        for (int[] d : data) {
            Arrays.sort(d);
            for (int a : d) {
                System.out.print(a + ",");
                sum += a;
            }
            System.out.println();
        }
        System.out.println("Sum : "+sum);
    }
}
