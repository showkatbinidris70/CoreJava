import java.util.Scanner;
public class PracticeArrString{
	
	public static void main(String[] args){
		String[] p = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter value ");
			  p[i] = sc.next();  
			
		}
			
		System.out.println("___________________________");	
		/* for(int i=0; i<p.length; i++){
			System.out.print(p[i]+" "); 
			
		} */
		for(String temp : p){
			System.out.print(temp);
		}
		
		
	}
	
}