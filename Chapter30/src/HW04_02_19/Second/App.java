/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW04_02_19.Second;

/**
 *
 * @author User
 */
public class App {

    public static void main(String[] args) {
        Uncle uncle = new Uncle();

        Thread uncleThread = new Thread(uncle);
        // Why will I use Thread target
        uncleThread.setName("Mr.Jamil");
        uncleThread.setPriority(1);
        uncleThread.start();

        Urmi urmi = new Urmi();

        Thread urmiThread = new Thread(urmi);
        // Why will I use Thread target
        urmiThread.setName("Urmi");
        urmiThread.setPriority(10);
        urmiThread.start();

        System.out.println("uncleThread" + uncleThread.getName());
        System.out.println("urmiThread" + urmiThread.getName());
        System.out.println("uncleThread" + uncleThread.getPriority());
        System.out.println("urmiThread" + urmiThread.getPriority());
    }
}
