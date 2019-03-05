/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewFile;

import static NewFile.NewFile.printFileDetails;
import java.io.File;

/**
 *
 * @author User
 */
public class RenameFile {
    public static void main(String[] args)throws Exception {
       File firstFile = new File("my_first_file.txt");
       File secondFile = new File("my_second_file.txt");
       
       boolean fileCreated = firstFile.createNewFile();
       if(fileCreated || firstFile.exists()){
       printFileDetails(firstFile);
       printFileDetails(secondFile);
       boolean renameFlag = firstFile.renameTo(secondFile);
       if(!renameFlag){
           System.out.println("Could not rename "+ firstFile);
       }
       printFileDetails(firstFile);
       printFileDetails(secondFile);    
       }
       
    }
     public static void printFileDetails(File f){
        System.out.println("Absolute Path: " + f.getAbsoluteFile());
        System.out.println("Does the File exist: " + f.exists());
         }

}
