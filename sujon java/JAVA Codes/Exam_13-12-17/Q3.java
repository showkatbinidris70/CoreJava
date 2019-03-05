//Prime number
public class Q3{
	public static void main(String[] args){
		
		
		int s = 0;
		for(int i=1; i<=50; i++){
			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				s++;
				System.out.println("The number"+i+" is prime.");
			}else{
				System.out.println("The number"+i+" is not prime.");
			}
		}
		System.out.println("Total prime numbers in(1-50): "+s);
	}
}