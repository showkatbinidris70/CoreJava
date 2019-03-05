/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.p225;

import com.google.p224.RandomCharacter;

/**
 *
 * @author User
 */
public class TestRandomCharcter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        for (int i = 0; i < NUMBER_OF_CHARS; i++){
        char ch = RandomCharacter.getRandomLowerCaseLetter();
        if((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
            System.out.println(ch);
        }
    }
    
}
