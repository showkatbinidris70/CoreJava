import java.util.*;
public class AvgLarSmall{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();
		System.out.println("Enter a value for y:");
		int y = sc.nextInt();
		System.out.println("Enter a value for z:");
		int z = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		//Largest number
		if((x>=y)&&(x>=z)){
			System.out.println(x+" is the largest number!");
			a = x;
		}else if((y>=x)&&(y>=z)){
			System.out.println(y+" is the largest number!");
			a = y;
		}else{
			System.out.println(z+" is the largest number!");
			a = z;
		}
		//Smallest number
		if((x<=y)&&(x<=z)){
			System.out.println(x+" is the smallest number!");
			b = x;
		}else if((y<=x)&&(y<=z)){
			System.out.println(y+" is the smallest number!");
			b = y;
		}else{
			System.out.println(z+" is the smallest number!");
			b = z;
		}
		
		int av = (a+b)/2;
		System.out.println("The average of largest and smallest number is "+av);
	}
}