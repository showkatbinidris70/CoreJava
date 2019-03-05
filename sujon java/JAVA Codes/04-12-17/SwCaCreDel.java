//Switch Case File Create Delete
import java.io.File;
import java.util.Scanner;

public class SwCaCreDel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type 1 to create folder  2 to delete folder or -1 to exit");
		int n = sc.nextInt();
		
		while(n!=-1){
			switch(n){
				case 1:{
					m1();
					break;
				}
				case 2:{
					m2();
					break;
				}
				default:{
					System.out.println("Invalid number.");
				}
			}
			System.out.println("Type 1 to create folder  2 to delete folder or -1 to exit");
			n = sc.nextInt();
		}
		System.out.println("You are out of program!");
	}
	public static void m1(){
		
		String location_1 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\m";
		
		try{
			File f1 = new File(location_1);
			boolean b1 = f1.mkdir();
			
				if(b1){
					System.out.println("Folder is created!");
				}else{
					System.out.println("Folder is not created!");
				}
				
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static void m2(){
		
		String location_1 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\m";
		
		try{
			File f1 = new File(location_1);
			boolean b1 = f1.delete();
			
				if(b1){
					System.out.println("Folder is deleted!");
				}else{
					System.out.println("Folder is not deleted!");
				}
				
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}