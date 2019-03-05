//File creating from user
import java.util.regex.*;
import java.io.*;
import java.util.Scanner;

public class FileTest2{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			
			File f1 = new File("test2.txt");
			boolean b1 = f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Write your text here:");
			String s1 = sc.nextLine();
				bw.write(s1, 0, s1.length());
				bw.flush();
				bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}