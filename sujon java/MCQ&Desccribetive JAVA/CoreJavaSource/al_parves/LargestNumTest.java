import java.util.*;
public class LargestNumTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first value : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second value : ");
		int y = sc.nextInt();

		System.out.print("Enter third value : ");
		int z = sc.nextInt();

		if((x>y) && (x>z)){
			System.out.println(x+" is largest number");
		}else if((y>x) && (y>z)){

			System.out.println(y+" is largest number");
		}else{

			System.out.println(z+" is largest number");
		}

		

	}


}