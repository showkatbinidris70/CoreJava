/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p682;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author User
 */
public class TestDataStream {

    public static void main(String[] args) throws IOException {
        try ( // Create an output stream for file temp.dat 
                DataOutputStream output
                = new DataOutputStream(new FileOutputStream("temp.dat"));) {
            // Write student test scores to the file 
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("George");
            output.writeDouble(105.25);
        }

        try ( // Create an input stream for file temp.dat 
                DataInputStream input
                = new DataInputStream(new FileInputStream("temp.dat"));) {
            // Read student test scores from the file 
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        }
    }
}
