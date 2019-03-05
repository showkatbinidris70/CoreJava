import java.util.Scanner;
public class PracticeArrString{
	
	public static void main(String[] args){
		String[] p = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter value ");
			  p[i] = sc.next();  
			
		}
			
		/* System.out.println("___________________________");	
		System.out.println(p[0]+","+p[1]+","+p[2]+","+p[3]+","+p[4]); */
		System.out.println("___________________________");	
		
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]); 
			
		}
		System.out.println("___________________________");	
		for(int i=0; i<p.length; i++){
			System.out.print(p[i]+" "); 
			
		}
		System.out.println();	
		System.out.println("___________________________");	
		for(int i=0; i<p.length; i++){
			System.out.print(p[i]+"\n"); 
			
		}
		
		
	}
	
}