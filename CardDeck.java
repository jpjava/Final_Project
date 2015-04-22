/**
   Justin Pappano
   
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.*;
public class CardDeck
{
    public static final int SPADES=0;
    public static final int CLUBS=1;
    public static final int HEARTS=2;
    public static final int DIAMONDS=3;
    public static final int ACE =14;
    public static final int JACK= 11;
    public static final int QUEEN=12;
    public static final int KING=13;
    private int rank;
    private int suit;   
    private int card; 
    StringBuilder stringBuilder; 
 

    /**    @param the suit is the suit of the card
	   @param rank is the rank of the card
    */
    public CardDeck(int suit, int rank/* , int card*/)
    {
	super(); 
	this.suit= suit;
	//	this.rank=rank;
	this.card = card;
    }
    /** 
	@param this method returns the value of suit
    */

    public int getSuit()
    {

	return suit;

    }

    public int getRank()
    {
	return rank;
    }
    
    public void getCard(int card)
    {
	this.card = card; 
    }
    public String toString()
    {
	stringBuilder = new StringBuilder(); 
	String suitString ="";
	switch(suit)
	    {
	    case SPADES:
		suitString="SPADE";
		break; 
	    case CLUBS:
		suitString=" CLUBS";
		break;
	    case HEARTS:
		suitString="HEARTS" ;
		break;
	    case DIAMONDS:
		suitString=" DIAMONDS" ;
		break;
		
	    }
	String rankString="" ;
	switch(rank)
	    
	    {
	    case JACK:
		rankString="JACK";
		break; 
	    case QUEEN: 
		rankString = "QUEEN";
		break;
	    case KING:
		rankString = "KING";
		break;
	    case ACE:
		rankString = "ACE";
		break;
	
	    }
       
	switch(card)
	    {
	    case 11:
		stringBuilder.append("JACK");
		break; 
	    case 12:
		stringBuilder.append("QUEEN");
		break;
	    case 13:
		stringBuilder.append("KING");
		break;
	    case 14:
		stringBuilder.append("ACE");
		break;
	    default: 
		stringBuilder.append(card); 
		stringBuilder.append(" of " ); 
	    }
	stringBuilder.append( " of " );
	switch ( suit )
	    {
	case 0 :
            stringBuilder.append( "hearts" );
            break;
	case 1 :
            stringBuilder.append( "diamonds" );
            break;
	case 2 :
            stringBuilder.append( "clubs" );
            break;
	case 3 :
            stringBuilder.append( "spades" );
            break;
	}
	String totalString= rankString + "of" + suitString;
        return stringBuilder.toString( ) + totalString; 
	

    }    
	

    public boolean equals(CardDeck otherCard) 
    {
	if ((rank !=otherCard.rank) || (suit != otherCard.suit))
	    {	   
		return false;
	    }
	else 
	    {
		return true;
	    }
    }

}
