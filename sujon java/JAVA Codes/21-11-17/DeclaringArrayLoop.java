import java.util.Scanner;
public class DeclaringArrayLoop{
	public static void main(String[] args){
		int[] a1 = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a1.length; i++){
			System.out.println("Enter vaqlue for position "+i);
			a1[i] = sc.nextInt();
		}
		for(int i=0; i<a1.length; i++){
		System.out.println(a1[i]);
		}
	}
}