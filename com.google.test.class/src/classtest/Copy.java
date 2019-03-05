/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class Copy {

    public static void main(String[] args) throws IOException {
//        if (args.length != 2) {
//            System.out.println("Usage: java copy sourceFile targetfile");
//            System.exit(1);
//        }
//        File sourceFile = new File(args[0]);
//        if (!sourceFile.exists()) {
//            System.out.println("Source file " + args[0] + "does not exist");
//            System.exit(2);
//        }
//        File targetFile = new File(args[1]);
//        if (targetFile.exists()) {
//            System.out.println("target file " + args[1] + " already exists");
//            System.exit(3);
//        }
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream("temp.dat"));
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("targetFile.dat"));) {
            int r, numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }
            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }

}
