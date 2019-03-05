/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoDimentionalArray;

/**
 *
 * @author User
 */
public class TwoDimentionalArray {
    public static void main(String[] args) {
      
         int twoD[][]={
        {2,3,5,6},
        {7,8,9},
        {1,4,7,9}
    };
   
    System.out.println("twoD[2][1]:" + twoD[2][3]);
    for(int oneD[] : twoD){
    for(int i : oneD){
        System.out.print(i +" ");
    }
        System.out.println();
    }
   /* String[][]str2D = {
        {"A","C"},
        {"F", "G"}
    }*/
    }
   
    
    
}
