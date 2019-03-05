/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectionSort;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class TwoDArray {
    public static void main(String[] args) {
         int[][] arr2D= {
             {4,8,7,1,2,3,5},
             {11,9,55,77,12,45}
    }; 
         for (int [] oneD : arr2D) {
             Arrays.sort(oneD);
             for(int i : oneD){
                 System.out.print(i +",");
             }
             System.out.println();
        }
    }
    
}
