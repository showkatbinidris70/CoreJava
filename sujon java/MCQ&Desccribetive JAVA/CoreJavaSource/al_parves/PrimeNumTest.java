import java.util.*;
public class PrimeNumTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value for find Primnumber : ");
		int pri = sc.nextInt();
		int p = 0;
		
		
		for(int i =1; i<=pri; i++){

			if(pri%i==0){
		  
				p++;
			}
		}
		
		if(p==2){
			
			System.out.println(pri+" is prime number!");
		}else{

			System.out.println(pri+" is not prime number!");		
		}

	}


}