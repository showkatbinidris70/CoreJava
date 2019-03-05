import java.util.Scanner;
public class While{
	public static void main(String[] args){
		int[] a1 = new int[10];
		Scanner sc = new Scanner(System.in);
		
		int j=0;
		while(j<a1.length){
			System.out.println("Enter vaqlue for position "+j);
			a1[j] = sc.nextInt();
			j++;
		}
		for(int i=0; i<a1.length; i++){
		System.out.println(a1[i]);
		}
	}
}