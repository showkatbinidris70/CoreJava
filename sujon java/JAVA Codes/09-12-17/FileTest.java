//File creating
import java.util.regex.*;
import java.io.*;

public class FileTest{
	public static void main(String[] args){
		try{
			File f1 = new File("test.txt");
			boolean b1 = f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
			String s1 = "Bangladesh";
				bw.write(s1, 0, s1.length());//You can set '1/2/5/4/7 etc' in the place of 's1.length()'
				bw.flush();
				bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}