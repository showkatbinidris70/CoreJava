
package com.google.p37;

import java.util.Scanner;

public class ComputeAreaWithConcoseInput {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Enter redius : ");
        double redius = cs.nextDouble();
        double area = redius * redius *3.1416;
        
        System.out.println("Result of area : "+area);
    }
    
}
