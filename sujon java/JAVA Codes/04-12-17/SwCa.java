//Switch Case
import java.io.File;
import java.util.Scanner;

public class SwCa{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n!=-1){
			switch(n){
				case 1:{
					System.out.println("Do some work here.");
					break;
				}
				case 2:{
					System.out.println("You have entered 2.");
					break;
				}
				default:{
					System.out.println("This is default.");
				}
				System.out.println("Type 1 for Bangla or 2 for English");
				n = sc.nextInt();
			}
		}
		System.out.println("You are out of program!");
	}
}