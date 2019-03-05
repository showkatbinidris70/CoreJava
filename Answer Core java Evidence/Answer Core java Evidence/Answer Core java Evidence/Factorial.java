import java.util.Scanner;
class Factorial{
	public static void main (String [] args){	
	Scanner s = new Scanner (System.in);
	int a=s.nextInt();
	int fact=1;
    for(int i=a; i>1; i--)
  {
   fact*=i;
  }
  System.out.println(fact);
	}
}