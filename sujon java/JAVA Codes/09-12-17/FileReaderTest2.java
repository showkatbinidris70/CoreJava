//File reader
import java.util.regex.*;
import java.io.*;

public class FileReaderTest2{
	public static void main(String[] args){
		try{
			File f1 = new File("test.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			char[] c = new char[1];
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