
package card;

/**
 @author:  Mohamed Bekhouche
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
         
        }
        
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter the suit: ");
        String inputSuit = input.next() ; 
        System.out.println("Enter the number of the card: ") ;
        int inputValue = input.nextInt() ;
        
         Card luckyCard = new Card();
         luckyCard.setSuit(inputSuit);
         luckyCard.setValue(inputValue);
        
          boolean found = false;
         for (Card c : magicHand) {
         if (c.getSuit().equalsIgnoreCase(luckyCard.getSuit()) && c.getValue() == luckyCard.getValue()) {
            found = true;
            break;
        }
    }
    
    if (found == true) {
        System.out.println("Your card is the Lucky Card.");
    } else {
        System.out.println("Your card is not the Lucky Card.");
    }
    }
    
}
