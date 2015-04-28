/**
   Justin Pappano
   CS 110
   Final Project

   This is my CardDeck class that holds setters, getters
   in addition to all card possibilities.
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
 

    /**  
	 I am going to choose to give myself 
	 the option of being able to get a rank 
	 although that may not be necessarry.
	 @param the suit is the suit of the card
	 @param rank is the rank of the card
    */
    public CardDeck(int suit, int rank/* int card*/)
    {

	super(); 
	this.suit= suit;
	this.rank=rank;
	//this.card = card;
    }
    /** 
	This method returns the value of the suit
	@param suit
    */

    public int getSuit()
    {

	return suit;

    }
    /**
       This method returns the calue of the rank of the card
       @return rank
    */
    public int getRank()
    {
	return rank;
    }
    /**
       This method sets the cards rank and suit
       @param card
    */
    public void setCard(int card)
    {
	this.card = card; 
    }
    /**
       This method returns the card that is drawn
       @return card
    */
    public int getCard()
    {
	return card;
    }
    /**
       @return stringBuilder.toString( ) 
       @return  totalString
    */
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
	    default: 
		rankString = Integer.toString(rank); 
	    }

 	switch ( suit )
	    {
	case 2 :
            stringBuilder.append( "hearts" );
            break;
	case 3 :
            stringBuilder.append( "diamonds" );
            break;
	case 1 :
            stringBuilder.append( "clubs" );
            break;
	case 0 :
            stringBuilder.append( "spades" );
            break;
	}
	String totalString= rankString  + suitString;
	// return stringBuilder.toString( ) + totalString; 
	return totalString; 

    }   

   
    /**
       THis method is designed to make sure the card drawn is accurate
       @param true || false
    */
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
