/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @author Sean Sumangil
 */


import java.util.Scanner;

/**
 * SEAN SUMANGIL
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];

        for (int i=0; i< magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13) + 1);
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a card Any Card.");
        System.out.print("Enter a number between 1 and 13: ");
        int userValue = input.nextInt();
        input.nextLine();
        System.out.print("Enter a suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = input.nextLine();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() &&
                card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        input.close();
    }

}

