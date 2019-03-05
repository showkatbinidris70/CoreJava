//Switch Case ATM
import java.io.File;
import java.util.Scanner;

public class SwCa4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n 1.Bangla \n 2.English \n 3.Exit");
		int n = sc.nextInt();
		
		while(n!=3){
			switch(n){
				case 1:{
					System.out.println("Bangla selected.");
					
					System.out.println("\n 1.Taka uttolon korun \n 2.Balance check korun \n 3.Balance transfer korun \n 0.Main menu");
					int m = sc.nextInt();
					
					while(m!=0){
						switch(m){
							case 1:{
								System.out.println(" Uttolon korun.");
								break;
							}
							case 2:{
								System.out.println(" Balance check korun.");
								break;
							}
							case 3:{
								System.out.println(" Balance transfer korun.");
								break;
							}
							default:{
								System.out.println(" Vul chaplen!");
							}
						}
						System.out.println("\n 1.Taka uttolon korun \n 2.Balance check korun \n 3.Balance transfer korun \n 0.Main menu");
						m = sc.nextInt();
					}
					break;
				}
				case 2:{
					System.out.println("English selected.");
					System.out.println("\n 1.Witdraw Taka \n 2.Check balance \n 3.Transfer balance \n 0.Main menu");
					int l = sc.nextInt();
					
					while(l!=0){
						switch(l){
							case 1:{
								System.out.println(" Withdraw selected.");
								break;
							}
							case 2:{
								System.out.println(" Balance check selected.");
								break;
							}
							case 3:{
								System.out.println(" Balance transfer selected.");
								break;
							}
							default:{
								System.out.println(" Invalid number!");
							}
						}
						System.out.println("\n 1.Witdraw Taka \n 2.Check balance \n 3.Transfer balance \n 0.Main menu");
						l = sc.nextInt();
					}
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