import java.util.ArrayList; 

public class Card extends CardDeck
{
    private ArrayList<CardDeck> contents;
    public Deck()
    {
	//make an arraylist which holds the
	//deck of cards
	contents = new ArrayList<CardDeck>();
	for (int i= 1; i< 14; i++)
	    {
		
		for(int j = 1; j<15; j++)
		    {
			contents.add(i, j);
			
		    }
	    }
    }
    /**
       When the player draws a card, 
       he/she loses one from the deck
    */
    public CardDeck Draw()
    {
	return contents.remove[0]; 
	
    }
    /**
       if the player wins the card
       adds a card to his/her deck
       @param newCard
    */
    public void Win(CardDeck newCard)
    {
	contents.add(newCard); 
    }
    Collection.shuffle(deck, new Random(System.
}
