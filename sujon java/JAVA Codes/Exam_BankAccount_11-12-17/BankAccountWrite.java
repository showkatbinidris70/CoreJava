import java.io.*;

public class BankAccountWrite{
	public static void main(String[] args){
		BankAccount ba = new BankAccount(123456,"m125487","Monirul",25,"Mirpur","monirul@mail.com","01758-986214",25000.50,9.0,true);
		try{
			
			
			File f1 = new File("AccountInfo.txt");
			
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(ba);
			oos.flush();
			oos.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}