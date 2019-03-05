/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author User
 */
public class Sumfrom1to10ButoddNumber {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i+=2) {
            sum+=i;
        }
        System.out.println("Total " + sum);
    }
}
