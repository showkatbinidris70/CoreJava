import java.util.Scanner;
public class M{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String [] y;
		while(x!="a"){
			y.push(x);
			x = sc.next();
		}
		System.out.println(y);
	}
}