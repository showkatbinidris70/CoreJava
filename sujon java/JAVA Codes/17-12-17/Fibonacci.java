public class Fibonacci{
	public static void main(String[] args){
		
		int a = 0;
		int b = 1;
		int f = 0;
		int x = 10;
		
		for(int i=1; i<=x; i++){
			System.out.print(" "+f);
			f = a + b;
			b = a;
			a = f;
			
		}
	}
}