import java.util.regex.*;
import java.io.*;
import java.util.*;

public class CreateReadFile{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			
			File f1 = new File("a.txt");
			boolean b1 = f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Write your text here:");
			String s1 = sc.nextLine();
				bw.write(s1, 0, s1.length());
				bw.flush();
				bw.close();
				
			File f2 = new File("a.txt");
			FileReader fr = new FileReader(f2);
			BufferedReader br = new BufferedReader(fr);
				char c[] = new char[1];
				int n = br.read(c, 0, 1);
				
				while(n!=-1){
					System.out.print(c);
					n = br.read(c, 0, 1);
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}