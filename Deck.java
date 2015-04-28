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
import javax.swing.JOptionPane; 

public class Deck 
{
    /**
       put all of the cards from the CardDeck into a class
    */
    private ArrayList<CardDeck>contents = new ArrayList<CardDeck>();
    private  LinkedList<CardDeck> drHorton = new LinkedList<CardDeck>();
    private LinkedList<CardDeck> lily = new LinkedList<CardDeck>();
   
    /**
       The imported java utility shuffles the deck immediately
    */
    public void Shuffle()
    {
	Collections.shuffle(contents, new Random(System.nanoTime())); 
    
	/**
	   Here is dr. hortons deck which is of course half 
	   of the shuffled card deck
	*/
	//	LinkedList<CardDeck> drHorton = new LinkedList<CardDeck>(); 
	drHorton.addAll(contents.subList(0, 25));
	/**
	   Here is dr. hortons deck which is of course half                    
           of the shuffled card deck  
	*/
	//	LinkedList<CardDeck> lily = new LinkedList<CardDeck>(); 
	lily.addAll(contents.subList(26, 52)); 
       
	
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
    }

    public void singleRound() 
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
		System.out.println("Dr.Horton Wins"); 
		
	    }
	/**
	   what happens when lily wins
	*/
	else if (drHortonDraw.getRank() < lilyDraw.getRank())
	    {
		lily.addLast(drHortonDraw); 
		lily.addLast(lilyDraw); 
		System.out.println("Lily Wins!!!!"); 
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
		//	break; 
	    }
	else if (lily.size()==0)
	    {
		System.out.println("Lily wins!"); 
		//	break; 
	    }
    }
}



