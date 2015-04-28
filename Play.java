public class Play extends Deck 
{
public Play()
{
    super();
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
		break; 
	    }
	else if (lily.size()==0)
	    {
		System.out.println("Lily wins!"); 
		break; 
	    }
    }
}
 
