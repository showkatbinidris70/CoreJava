/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromMinhaz;

/**
 *
 * @author User
 */
public class CountAndReplaceString {

    public int countChar(String s, char c) {
        String [] s = {"m,n,o,p,s,o,l,o,q,p,o,m,o,l,o,k,o,l,o"};
        
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
       
    }
}
