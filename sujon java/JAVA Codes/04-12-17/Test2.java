import java.io.File;

public class Test2{
	public static void main(String[] args){
		
		String location_1 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2";
		String location_2 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1";
		String location_3 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1\\Folder-2.2";
		String location_4 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1\\Folder-2.2\\a.jpg";
		try{
			File f1 = new File(location_1);
			boolean b1 = f1.mkdir();
			File f2 = new File(location_2);
			boolean b2 = f2.mkdir();
			File f3 = new File(location_3);
			boolean b3 = f3.mkdir();
			File f4 = new File(location_4);
			boolean b4 = f4.createNewFile();
				if(b1){
					System.out.println("Folder-2 is created!");
				}else{
					System.out.println("Folder-2 is not created!");
				}
				if(b2){
					System.out.println("Folder-2.1 is created!");
				}else{
					System.out.println("Folder-2.1 is not created!");
				}
				if(b3){
					System.out.println("Folder-2.2 is created!");
				}else{
					System.out.println("Folder-2.2 is not created!");
				}
				if(b4){
					System.out.println("File is created!");
				}else{
					System.out.println("File is not created!");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}