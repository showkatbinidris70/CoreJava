import java.io.File;

public class Test{
	public static void main(String[] args){
		
		String location_1 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-1";
		String location_2 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-1\\a.txt";
		try{
			File f1 = new File(location_1);
			boolean b1 = f1.mkdir();
			File f2 = new File(location_2);
			boolean b2 = f2.createNewFile();
				if(b1){
					System.out.println("Folder is created!");
				}else{
					System.out.println("Folder is not created!");
				}
				if(b2){
					System.out.println("File is created!");
				}else{
					System.out.println("File is not created!");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}