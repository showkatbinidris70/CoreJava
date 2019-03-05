/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewFile;

import java.io.FileReader;

/**
 *
 * @author User
 */
public class ReadFromFile {
    public static void main(String[] args) throws Exception{
        String srcFile = "my_second_file.html";
        BufferedReader br = new BufferedReader(new FileReader(srcFile));
        String text = null;
        String lines = "";
        while((text = br.readLine()) != null){
            System.out.println(text);
            lines += text + " ";
            
        }
        System.out.println("lines: " + lines);
        if(lines.contains("Dhaka")){
            System.out.println("Exit");
        }else{
            System.out.println("Not Exist");
        }
    }
    
}
