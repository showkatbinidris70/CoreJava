import java.util.*;
public class Q1{

    public static void main(String [] args){
        int [] a=new int[10];
         Scanner sc=new Scanner(System.in);
         System.out.println("enter ten value");
         for(int i=0;i<a.length;i++){
             a[i]=sc.nextInt();
         }
          Arrays.sort(a);
        int k=a[0]+a[9];
        
      System.out.println("sumation is "+k);

    }




}