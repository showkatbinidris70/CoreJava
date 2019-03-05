import java.util.*;
public class AmPm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time:");
		double t = sc.nextDouble();
		System.out.println("----------------------------------------------------");
		
		if((t>=1.00)&&(t<=12.00)){
			System.out.println("It is "+t+" AM.\n Good-Morning!");
		}else if((t>=13.00)&&(t<=18.00)){
			System.out.println("It is "+t+" PM.\n Good-Afternoon!");
		}else if((t>=19.00)&&(t<=20.00)){
			System.out.println("It is "+t+" PM.\n Good-Evening!");
		}else if((t>=21.00)&&(t<=24.00)){
			System.out.println("It is "+t+" PM.\n Good-Night!");
		}else{
			System.out.println("Invalid time!\n Enter time(1:00-24:00)");
		}
		
	}
}