import java.io.File;

public class Test2del{
	public static void main(String[] args){
		
		String location_1 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2";
		String location_2 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1";
		String location_3 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1\\Folder-2.2";
		String location_4 = "D:\\Monirul-1240090\\JAVA Codes\\04-12-17\\Folder-2\\Folder-2.1\\Folder-2.2\\a.jpg";
		
		try{
			
			File f4 = new File(location_4);
			boolean b4 = f4.delete();
			File f3 = new File(location_3);
			boolean b3 = f3.delete();
			File f2 = new File(location_2);
			boolean b2 = f2.delete();
			File f1 = new File(location_1);
			boolean b1 = f1.delete();
				if(b1){
					System.out.println("Folder-2 is deleted!");
				}else{
					System.out.println("Folder-2 is not deleted!");
				}
				if(b2){
					System.out.println("Folder-2.1 is deleted!");
				}else{
					System.out.println("Folder-2.1 is not deleted!");
				}
				if(b3){
					System.out.println("Folder-2.2 is deleted!");
				}else{
					System.out.println("Folder-2.2 is not deleted!");
				}
				if(b4){
					System.out.println("File is deleted!");
				}else{
					System.out.println("File is not deleted!");
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}