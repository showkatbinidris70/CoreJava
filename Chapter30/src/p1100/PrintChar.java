/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1100;

/**
 *
 * @author User
 */
public class PrintChar implements Runnable{
    private char charToPrint;
    private int times;
    
    public PrintChar(char c, int t){
    charToPrint = c;
    times = t;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
  
}
