/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewFile;

import java.io.File;

/**
 *
 * @author User
 */
public class NewFile {
    public static void main(String[] args) throws Exception {
        File newFile = new File("Showkat.txt");
        printFileDetails(newFile);
        //Create a new file
        boolean fileCreated = newFile.createNewFile();
        if(!fileCreated){
            System.out.println(newFile+"  Could not be Created.");
        }
        printFileDetails(newFile);
        // Delete the new file
        newFile.delete();
        System.out.println("After deleting the new file:");
        printFileDetails(newFile);
        //rectrate the file
        newFile.createNewFile();
        printFileDetails(newFile);
        //let;s tell the JVM to detele this file on exit
        //newFile.deleteOnExit();
        System.out.println("After using ");
        printFileDetails(newFile);
    }

 
    public static void printFileDetails(File f){
        System.out.println("Absolute Path: " + f.getAbsoluteFile());
        System.out.println("Does the File exist: " + f.exists());
    }
}
