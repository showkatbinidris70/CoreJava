import java.util.*;
public class Q2{

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][3];
        
         for(int i=0;i<a.length;i++){

              if(i==0){System.out.println("enter value for first diamensonal array");}
              else if(i==1){System.out.println("enter value for second diamensonal array");}
              else{System.out.println("enter value for third diamensonal array");}

              for(int j=0;j<a[i].length;j++){

                 a[i][j]=sc.nextInt();
              }
         }
           Arrays.sort(a[0]);
           Arrays.sort(a[1]);
           Arrays.sort(a[2]);

         for(int i=0;i<a.length;i++){

              if(i==0){System.out.print("first diamensonal array contains ");}
              else if(i==1){System.out.print("second diamensonal array contains ");}
              else{System.out.print("third diamensonal array contains ");}

              for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j]+" ");
              } System.out.println(" ");
         }

    }




}