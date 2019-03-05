//File reader
import java.util.regex.*;
import java.io.*;

public class FileReaderTest{
	public static void main(String[] args){
		try{
			File f1 = new File("test.txt");
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			char[] c = new char[100];
			int n = br.read(c, 0, 6);
			
			System.out.println(n);
			System.out.println(c);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}