public class Factorial{
	public static void main(String[] args){
		int t = 5;
		int f = 1;
		for(int i=t; i>=1; i--){
			f = f*i;
		}
		System.out.println("The factorial of "+t+" is "+f);
		
	}
}