/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;





/**
 *
 * @author User
 */
public class DetectEndOfFile {

    public static void main(String[] args) throws IOException {
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }
            try (DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))) {
                while (true) 
                    System.out.println(input.readDouble());
                
            }
        }

    
    catch(EOFException ex

    
        ){
          System.out.println("All data were read");
    }
    catch(IOException

    
        ){
      ex.printStackTrace();
    }
}
}