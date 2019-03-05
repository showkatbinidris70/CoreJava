import java.util.Scanner;
public class LargestSmallest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x");
		int x = sc.nextInt();
		System.out.println("Enter value for y");
		int y = sc.nextInt();
		System.out.println("Enter value for z");
		int z = sc.nextInt();
		if ((x > y) && (x > z)){
			System.out.println(x+" is the largest nimber!");
		}else if((y > x) && (y > z)){
			System.out.println(y+" is the largest nimber!");
		}else{
			System.out.println(z+" is the largest nimber!");
		}
		if ((x < y) && (x < z)){
			System.out.println(x+" is the lowest nimber!");
		}else if((y < x) && (y < z)){
			System.out.println(y+" is the lowest nimber!");
		}else{
			System.out.println(z+" is the lowest nimber!");
		}
	}
}