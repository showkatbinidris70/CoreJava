import java.util.Scanner;
import java.util.ArrayList;
public class Loop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList aList = new ArrayList();
		
		for(int i=0; i<5; i++){
			System.out.println("Enter vaqlue for position "+i);
			aList.add(sc.nextInt());
		}
		for(int i=0; i<aList.size(); i++){
		System.out.println(aList.get(i));
		}
	}
}