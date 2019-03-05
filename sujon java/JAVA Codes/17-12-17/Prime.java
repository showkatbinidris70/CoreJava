public class Prime{
	public static void main(String[] args){
		int t = 5;
		int sum = 0;
		for(int i=1; i<=t; i++){
			if(t%i==0){
				sum++;
			}
		}
		if(sum==2){
			System.out.println("The number "+t+" is prime.");
		}else{
			System.out.println("The number "+t+" is not prime.");
		}
		
	}
}