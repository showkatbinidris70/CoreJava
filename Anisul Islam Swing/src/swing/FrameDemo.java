/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FrameDemo {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setSize(400, 300);
        jframe.setLocation(200, 50);

    }
}
