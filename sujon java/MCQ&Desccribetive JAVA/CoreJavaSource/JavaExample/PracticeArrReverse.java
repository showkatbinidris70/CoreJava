import java.util.Scanner;
public class PracticeArrReverse{
	
	public static void main(String[] args){
		char[] p = new char[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter value ");
			 String s  = sc.next();
			 p[i] = s.charAt(0); 
			
		}
			
		System.out.println("___________________________");	
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]); 
			
		}
		System.out.println("___________________________");
			for(int i=p.length-1; i>=0; i--){
				System.out.print(p[i]);
			}
		
		
	}
	
}