import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.*;
import javax.swing.JOptionPane;

public class  DeletethisShit
{

    public static void main(String[] args)
    {
	 ArrayList<CardDeck>contents = new ArrayList<CardDeck>();
	
	 for (int i= 0; i< 4; i++)
	     {

		 for(int j = 1; j<14; j++)
		     {
			 contents.add(new CardDeck(i, j));

		     }
	     } 

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
	    while(true)
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

