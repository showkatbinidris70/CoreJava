import java.util.*;
public class q4{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
   int add;
   int[]a=new int[10];

    for(int i=0;i<10;i++){
         a[i]=sc.nextInt();



       }
       Arrays.sort(a);
       
      System.out.println("Max  number is" +a[9]);
       System.out.println("Min  number is" +a[0]);


    }




}