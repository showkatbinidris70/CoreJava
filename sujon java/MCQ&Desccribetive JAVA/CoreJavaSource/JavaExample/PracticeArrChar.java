import java.util.Scanner;
public class PracticeArrChar{
	
	public static void main(String[] args){
		char[] p = new char[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter first value ");
			 String s = sc.next(); 
			 p[i] = s.charAt(0);
			
		}
			
		/* System.out.println("___________________________");	
		System.out.println(p[0]+","+p[1]+","+p[2]+","+p[3]+","+p[4]); */
		System.out.println("___________________________");	
		
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]); 
			
		}
		System.out.println("___________________________");	
		for(int i=0; i<p.length; i++){
			System.out.print(p[i]); 
			
		}
	}
	
}