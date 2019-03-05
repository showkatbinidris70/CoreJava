import java.util.Scanner;
public class PraLoop{
	
	public static void main(String[] args){
	
		int even=0;
		int odd=0;
		for(int i=0; i<=20; i++){
			
				if(i%2==0){
						for(int j=0; j<2; j++){
								System.out.println(i+" is Even");
						}
						even++;
				}else{
						for(int j=0; j<2; j++){
							System.out.println(i+" is Odd");	
						}
						odd++;
						
				}
		}
		System.out.println("___________________");
		System.out.println(even+" is Even");
		System.out.println(odd+" is Odd");
	}
	
}