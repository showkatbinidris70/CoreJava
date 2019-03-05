import java.io.*;

public class BankAccountWriteRead{
	public static void main(String[] args){
		try{
			BankAccount acchol1 = new BankAccount(1234567890,"mn1234","Monirul",25,"Mirpur","monirul@yahoo.com","01765-598855",50000.60,9.05,true);
			
			File f1 = new File("AccountInfo.txt");
			boolean b1 = f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(acchol1);
				oos.flush();
				oos.close();
				
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Object ob = ois.readObject();
			BankAccount bac = (BankAccount)ob;
			
			System.out.println(bac.accNumber);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}