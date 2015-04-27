/**
   Justin Pappano
   CS110
   Final Project

   This is the class that makes the Deck that 
   the cards are added to. 
   In addition, it also implements the rules of the
   war game with Dr. Horton and lily playing against 
   each other.
*/

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.LinkedList; 
import java.util.List; 
import java.util.Random; 
import java.util.*; 


public class Deck // extends CardDeck
{
   
    //    private boolean play;
    //    private ArrayList<CardDeck> contents;
    public static void main(String[] args)
    {
	
	//    public Deck(CardDeck contents)
	
	boolean play =true; 
	//make an arraylist which holds the
	//deck of cards

	/**
	   put all of the cards from the CardDeck into a class
	*/
	ArrayList<CardDeck>contents = new ArrayList<CardDeck>();
	/**
	   Double for loops used to add a suit and number/rank to 
	   the the deck
	*/
	for (int i= 0; i< 4; i++)
	    {
		
		for(int j = 1; j<14; j++)
		    {
			contents.add(new CardDeck(i, j));
			
		    }
	    }
	/** }
	    /**
	    When the player draws a card, 
	    he/she loses one from the deck
	    
	    public CardDeck Draw()
	    {
	    return contents.remove[0]; 
	
	    }
	    /**
	    if the player wins the card
	    adds a card to his/her deck
	    @param newCard
    
	    public void Win(CardDeck newCard)
	    {
	    contents.add(newCard); 
	    }
	    public void Shuffle()
	    {
	*/

	/**
	   The imported java utility shuffles the deck immediately
	*/
	Collections.shuffle(contents, new Random(System.nanoTime())); 
    
	/**
	   Here is dr. hortons deck which is of course half 
	   of the shuffled card deck
	*/
	LinkedList<CardDeck> drHorton = new LinkedList<CardDeck>(); 
	drHorton.addAll(contents.subList(0, 25));
	/**
	   Here is dr. hortons deck which is of course half                    
           of the shuffled card deck  
	*/
	LinkedList<CardDeck> lily = new LinkedList<CardDeck>(); 
	lily.addAll(contents.subList(26, 52)); 
       
	//This should probably be a do-while loop
	while (play)
	    {
		CardDeck drHortonDraw = drHorton.pop();
		CardDeck lilyDraw = lily.pop();

		System.out.println("Dr. Horton: " + drHortonDraw.toString()); 
		System.out.println("Lily: " + lilyDraw.toString()); 
		/**
		   what happens when dr. horton wins
		*/
		if (drHortonDraw.getRank() > lilyDraw.getRank()) 
		    {
			drHorton.addLast(drHortonDraw); 
			drHorton.addLast(lilyDraw); 
		    }
		/**
		   what happens when lily wins
		*/
		else if (drHortonDraw.getRank() < lilyDraw.getRank())
		    {
			lily.addLast(drHortonDraw); 
			lily.addLast(lilyDraw); 
		    }
		else 
		    {   /** WAR!!*/
			System.out.println("War"); 
			List<CardDeck> war1 = new ArrayList<CardDeck>(); 
			List<CardDeck> war2= new ArrayList<CardDeck>();
			for (int i =0; i<3; i++)
			    {
				if (drHorton.size()==0 || lily.size()==0)
				    {
					break; 
				    }
				war1.add(drHorton.pop()); 
				war2.add(lily.pop()); 
			    }
			//fix
			System.out.println("Dr. Horton : " + war1.get(0).toString()); 

			System.out.println("Lily : " +war2.get(0).toString()); 
			if(war1.get(0).getRank() > war2.get(0).getRank())
			    {
				drHorton.addAll(war2); 
				lily.addAll(war1); 
				System.out.println("Dr. Horton WIns"); 
			    }
			else 
			    {
				lily.addAll(war2); 
				lily.addAll(war1); 
				System.out.println("Lily wins the game"); 
			    }
		    }
		/**
		   This determines who has won the game
		*/
		if (drHorton.size() ==0)
		    {
			System.out.println("Dr. Horton Wins"); 
			break; 
		    }
		else if (lily.size()==0)
		    {
			System.out.println("Lily wins!"); 
			break; 
		    }
	    }
			       
  
    }
}

