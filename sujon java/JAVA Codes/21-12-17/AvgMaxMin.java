import java.util.*;
public class AvgMaxMin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get average of max and min number and -1 to exit:");
		double z = sc.nextDouble();
		double max = z;
		double min = z;
		
		while(z!=-1){
			if(max < z){
				max = z;
			}
			if(min > z){
				min = z;
			}
			System.out.println("Enter number to get average of max and min number and -1 to exit:");
			z = sc.nextDouble();
		}
		
		double av = (max + min)/2;
		System.out.println("The maximum is "+max+"\nThe minimum is "+min+"\nThe average of maximum and minimum number is "+av);
	}
}