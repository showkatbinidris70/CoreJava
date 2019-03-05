import java.util.*;
public class ArrayPrint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value(-1 to stop):");
		int a = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(a>=0){
			sum = sum + a;
			al.add(a);
			System.out.println("Enter value(-1 to stop):");
			a = sc.nextInt();
			
		}
		Collections.sort(al);
		System.out.println("Sum:"+sum);
		System.out.println(al);
	}
}