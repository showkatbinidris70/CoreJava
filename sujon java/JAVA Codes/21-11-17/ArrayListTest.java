//Loop until input -1.
import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		int sum = 0;
		
		System.out.println("Put vlaue");
		int j = sc.nextInt();
		
		while(j!=-1){
			aList.add(j);
			System.out.println("Put vlaue");
			j = sc.nextInt();
		}
		for(int i=0; i<aList.size(); i++){
			sum = sum + aList.get(i);
			System.out.println(i+1+" no. value is " + aList.get(i));
		}
		System.out.println("Sum is "+sum);
	}
}