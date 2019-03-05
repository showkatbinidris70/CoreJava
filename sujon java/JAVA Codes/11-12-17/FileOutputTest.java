import java.io.*;
public class FileOutputTest{
	public static void main(String[] args){
		try{
			File f1 = new File("a.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			String s1 = "Bangladesh";
				oos.writeObject(s1);
				oos.flush();
				oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}