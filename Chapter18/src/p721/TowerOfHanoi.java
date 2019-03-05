/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p721;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TowerOfHanoi {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of disks");
        int n = input.nextInt();
        System.out.println("The moves are : ");
        moveDisks(n, 'A', 'B', 'C');
    }

    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from" + fromTower + " to" + toTower);
           
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + "from" + fromTower + "to" + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }

    }
}
