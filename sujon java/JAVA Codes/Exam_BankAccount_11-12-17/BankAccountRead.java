import java.io.*;

public class BankAccountRead{
	public static void main(String[] args){
		
		try{
			File f1 = new File("AccountInfo.txt");
			
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Object ob = ois.readObject();
			BankAccount bac =(BankAccount)ob;
			
			System.out.println("Account Number: "+bac.accNumber);
			System.out.println("Name: "+bac.name);
			System.out.println("Address: "+bac.address);
			System.out.println("Email: "+bac.email);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}