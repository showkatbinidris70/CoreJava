//Switch Case
import java.io.File;
import java.util.Scanner;

public class SwCa2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type 1 for Bangla or 2 for English");
		int n = sc.nextInt();
		
		while(n!=-1){
			switch(n){
				case 1:{
					System.out.println("Bangla selected.");
					break;
				}
				case 2:{
					System.out.println("English selected.");
					break;
				}
				default:{
					System.out.println("Invalid number.");
				}
			}
			System.out.println("Type 1 for Bangla or 2 for English");
			n = sc.nextInt();
		}
		System.out.println("You are out of program!");
	}
}