import java.util.Scanner;
class Prime{
	public static void main (String [] args){	
	Scanner s = new Scanner (System.in);
	int x=s.nextInt();
	int count=0;
	for(int i=1;i<=x;i++){
		if(x%i==0){
		count++;
		}
	}
	if (count==2){
			System.out.println("Prime");	
		}
		else{
				System.out.println("Not Prime");
		}
	}
}
