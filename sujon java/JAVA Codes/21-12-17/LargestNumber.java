import java.util.*;
public class LargestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for x:");
		int x = sc.nextInt();
		System.out.println("Enter a value for y:");
		int y = sc.nextInt();
		System.out.println("Enter a value for z:");
		int z = sc.nextInt();
		
		if((x>y)&&(x>z)){
			System.out.println(x+" is the largest number!");
		}else if((y>x)&&(y>z)){
			System.out.println(y+" is the largest number!");
		}else{
			System.out.println(z+" is the largest number!");
		}
	}
}