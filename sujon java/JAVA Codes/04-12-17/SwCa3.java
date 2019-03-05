//Switch Case
import java.io.File;
import java.util.Scanner;

public class SwCa3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n 1.Bangla \n 2.English \n 3.Exit");
		int n = sc.nextInt();
		
		while(n!=3){
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
			System.out.println("\n 1.Bangla \n 2.English \n 3.Exit");
			n = sc.nextInt();
		}
		System.out.println("You are out of program!");
	}
}