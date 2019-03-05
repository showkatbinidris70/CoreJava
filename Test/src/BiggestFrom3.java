
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
public class BiggestFrom3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        isBiggestNumber(input.nextInt(), input.nextInt(), input.nextInt());
    }

    static void isBiggestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is biggest number");
        } else if (n2 < n1 && n2 > n3) {
            System.out.println(n2 + " is biggest number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is biggest number");
        } else {
            System.out.println(n1 + " , " + n2 + " , " + n3 + " All are equals");
        }
    }
}
