
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
          c.setValue((int) (Math.random()*13+1)) ;
         
          c.setSuit(Card.SUITS[(int)(Math.random()*3+0)]); 
          magicHand[i] = c ;
          System.out.println(magicHand[i].getSuit() +  "  " + magicHand[i].getValue());
        }
        
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter the suit: ");
        String inputSuit = input.next() ; 
        System.out.println("Enter the number of the card: ") ;
        int inputValue = input.nextInt() ;
        
         Card userCard = new Card();
         userCard.setSuit(inputSuit);
         userCard.setValue(inputValue);
        
          boolean found = false;
         for (Card c : magicHand) {
         if (c.getSuit().equalsIgnoreCase(userCard.getSuit()) && c.getValue() == userCard.getValue()) {
            found = true;
            break;
        }
    }
    
    if (found == true) {
        System.out.println("Your card is in the magic hand!");
    } else {
        System.out.println("Your card is not in the magic hand.");
    }
    }
    
}
