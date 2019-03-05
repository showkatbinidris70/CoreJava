import java.io.*;
public class Writer1{

	public static void main(String[] args){

		
		
	  try{
		File file = new File("C:\\Users\\J2EE 26\\Desktop\\al_parves\\M\\N\\O\\P\\ParvsDocumnent.txt");
		boolean f1 = file.createNewFile();
		
		 boolean  f2 = file.exists();
		 System.out.println("The result is : "+f2);
		
		 FileWriter fr = new FileWriter(file);
		 fr.write("Hello welcome Bangladesh .....");
		 fr.flush();
		 fr.close();

		boolean f3 =file.delete();
		System.out.println("The deletion result is : "+f3);

		if(f3==true){

			System.out.println("Your file is alrady deleted");
		}
		 

	  }catch(FileNotFoundException fnf){
	
		System.out.println("There is FileNoteFoundException : "+fnf);
	  }catch(NullPointerException mpe){

		System.out.println("There are an Exception occur : "+mpe);
	  }catch(Exception ex){
	
		System.out.println("There are an Exception occur : "+ex);
	  }
	
	

	}
}