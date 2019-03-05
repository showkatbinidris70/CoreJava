import java.util.*;
public class q1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
ArrayList al=new ArrayList();
   int a=0;
   int sum=0;


    do{
       if(a!=-1){
System.out.println(" Imput the number stop the pograme: ");
    a=sc.nextInt();
         al.add(a);
        sum+=a;

          }



       }while(a !=-1);


System.out.println(" Total is: "+sum);


    }




}