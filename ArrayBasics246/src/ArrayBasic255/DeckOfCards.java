/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBasic255;

/**
 *
 * @author User
 */
public class DeckOfCards {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
            for (int j = 0; j < deck.length; j++) {
                int index = (int) (Math.random() * deck.length);
                int temp = deck[j];
                deck[j] = deck[index];
                deck[index] = temp;

            }
            for (int k = 0; k < 4; k++) {
                String suit = suits[deck[k] / 13];
                String rank = ranks[deck[k] % 13];            
             System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
            }
        }
    }

}
