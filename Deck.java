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

    private List<CardDeck> war1;
    private List<CardDeck> war2;   
    private  ArrayList<CardDeck> contents;
    private LinkedList<CardDeck> drHorton;
    private  LinkedList<CardDeck> lily;
    private String winner;
    private CardDeck drHortonDraw,lilyDraw;

    private int b;  
    public Deck()
    {

	/**
	   put all of the cards from the CardDeck into a class
	*/

	war1 = new ArrayList<CardDeck>();

	war2= new ArrayList<CardDeck>();

	contents = new ArrayList<CardDeck>();


	for (int i= 0; i< 4; i++)
	    {

		for(int j = 1; j<14; j++)
		    {
			contents.add(new CardDeck(i, j));

		    }
	    }


	drHorton = new LinkedList<CardDeck>();
	lily = new LinkedList<CardDeck>();

	Collections.shuffle(contents, new Random(System.nanoTime()));
	/**                                                                                                                                                   
																			      Here is dr. hortons deck which is of course half                                                                                                   
																			      of the shuffled card deck                                                                                                                          
	*/
	//      LinkedList<CardDeck> drHorton = new LinkedList<CardDeck>();                                                                                   
	drHorton.addAll(contents.subList(0, 25));
	/**                                                                                                                                                   
																			      Here is dr. hortons deck which is of course half                                                                                                   
																			      of the shuffled card deck                                                                                                                          
	*/
	//      LinkedList<CardDeck> lily = new LinkedList<CardDeck>();                                                                                       
	lily.addAll(contents.subList(26, 52));

    }
   

    public void singleRound() 
    {
 
        drHortonDraw = drHorton.pop();
	lilyDraw = lily.pop();
    
	System.out.println("Dr. Horton: " + drHortonDraw.toString()); 
	System.out.println("Lily: " + lilyDraw.toString()); 

	

	/**
	   what happens when dr. horton wins
	*/
	if (drHortonDraw.getRank() > lilyDraw.getRank()) 
	    {
		b = 1; 
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
		
		b = 2; 
		

	    }
	else 
	    {
		b=3;
		takeTurn();
	    }
		
	    

	/**
		
	   Lily please do not get mad about this code
	   I have placed it here in case I would like 
	   to change the rules of the game for fun
	   
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
	*/
    }
    public CardDeck getFaceUp(int a)
    {
	switch(a)
	    {
	    case 1: 
		return drHortonDraw;
	    case 2:
		return lilyDraw;
	    default:
		System.out.print("somthing went wrong");
	    }
	return null; 

    } 
    public void takeTurn()
    {
	this.singleRound();
    }

    public String getWinner()
    {
	/**
	   This determines who has won the game
	*/
	if (drHorton.size() ==0)
	    {
		winner= "lily has won the game!!:-)"; 
		//	break; 
	    }
	else if (lily.size()==0)
	    {
		winner= "Dr. Horton has won the game!! :-)"; 
		//	break; 
	    }
	return winner; 
    }

    public int drHortonGetSize()
    {
	return drHorton.size(); 
    }

    public int lilyGetSize()
    {
	return lily.size(); 
    }

    /**
       this returns who wins 
       each round. This Does NOT
       return who won the game
       @return 
    */
    public String drHortonWhoWon()
    {
	String whoWon = ""; 
	switch(b)
	    {
	    case 1: 
		whoWon = "Dr. Horton won the round"; 
		break; 
	    case 2: 
		whoWon = "Lily won the round"; 
		break;
	    case 3: 
		whoWon = "War! Each Player will throw down another card!!";
	    default:
		System.out.print("Something has gone terribly wrong!!");

	    }
	return whoWon; 
    }
}






