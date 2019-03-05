/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.p224;

/**
 *
 * @author User
 */
public class RandomCharacter {
    public static void main(String[] args) {
      getRandomCharacter(pen, table);  
    }
    public static char getRandomCharacter(char ch1, char ch2){
    return(char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter(){
    return getRandomCharacter('a', 'z');
    }
     public static char getRandomUpperCaseLetter(){
    return getRandomCharacter('A', 'z');
    }
    public static char getRandomDigitCharacter(){
    return getRandomCharacter('0', '9');
    }
    public static char getRandomCharcter(){
    return getRandomCharacter('\u0000', '\uFFFF');
    }
    
}
