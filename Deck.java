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
	
	boolean play; 
	//make an arraylist which holds the
	//deck of cards
	ArrayList<CardDeck>contents = new ArrayList<CardDeck>();
	for (int i= 1; i< 14; i++)
	    {
		
		for(int j = 1; j<15; j++)
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
    Collections.shuffle(contents, new Random(System.nanoTime())); 
    
    LinkedList<CardDeck> drHorton = new LinkedList<CardDeck>(); 
    drHorton.addAll(contents.subList(0, 25));

    LinkedList<CardDeck> lily = new LinkedList<CardDeck>(); 
    lily.addAll(contents.subList(26, 52)); 
    
   
}
}

