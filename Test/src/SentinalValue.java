
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class SentinalValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i >= -1; i++) {
            System.out.print("Enter your number: ");
            int x = input.nextInt();
            if (x > 0) {
                sum += x;
            } else {
                break;
            }

        }
        System.out.println("Total "+sum);
    }
}
