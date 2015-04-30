/**
   Justin Pappano
   My Card GUI!!!!!
   CS110
*/

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class WarGui extends JFrame
{
    /**
       so that there are 2 areas for player 1
       and player 2
    */
    private JPanel topPanel, gamePanel;
    private JLabel card1, card2; 
    
    private JButton button1; //button2; //so there are 2 buttons
    private JLabel status; //game status
    private JLabel title; //static title
    private Deck game;
    
    private ImageIcon Blue; 
    public WarGui() 
    {  
   
	//Start the game  
	/**
	   Constructor
	*/
	game = new Deck();
	
	
	setLayout(new GridLayout(2,2)); 
	
	//my panel
	topPanel = new JPanel(); 
	topPanel.setBackground(Color.GREEN); //Since Dr. Horton's favorite color is green
	topPanel.setLayout(new FlowLayout());
	
	//no reason for this size just something to start off as
	gamePanel = new JPanel(); 
	gamePanel.setBackground(Color.CYAN); 
   
	//add both panels
	add(topPanel); 
	add(gamePanel); 
	
	button1 = new JButton("Draw"); 
	//button2 = new JButton("Shuffle"); 
    
	button1.addActionListener(new ButtonListener());  
	//button2.addActionListener(new ButtonListener2());
    
	//love this title
	title = new JLabel("<html>This Means WAR!!!!! My favorite Professor is Dr. Horton" +
			   "<br>and my favorite grader is Lily. Today the 2 of them"
			   + "<br> are going to be playing the" 
			   + "game war against each other<html>"); 
	title.setFont(new Font("HELVETICA", Font.ITALIC, 36)); 
	topPanel.add(title);
    
	status = new JLabel("Game in prgoress"); 
	status.setFont(new Font("ARIAL", Font.ITALIC, 36));
	topPanel.add(title); 
	topPanel.add(status); 
    	
	ImageIcon bug = new ImageIcon("back.jpg");

	
	card1 = new JLabel("Dr.Horton's deck", bug, SwingConstants.LEFT); 
     
	gamePanel.add(card1);
	
	card2 = new JLabel("Lily's deck", bug, SwingConstants.RIGHT); 
	gamePanel.add(card2); 
   
	gamePanel.add(button1); 
       
    }

    /**
       Private inner class that handles the event when the 
       user clicks one of the check boxes.
    */
    private class ButtonListener implements ActionListener
    {

	public void actionPerformed(ActionEvent e) 
	{	 
	    if ((game.drHortonGetSize() >=0)||(game.lilyGetSize()==0))
		{
		    game.singleRound();
		    String s = game.getFaceUp(1).toString()+".jpg";
		    System.out.println(s);
		    card1.setIcon(new ImageIcon(game.getFaceUp(1).toString()+".jpg"));
		    card2.setIcon(new ImageIcon(game.getFaceUp(2).toString()+".jpg"));
		    status.setText(game.drHortonWhoWon());	         
		    if ((game.drHortonGetSize() ==0)||(game.lilyGetSize()==0))
			{   
			    status.setText(game.drHortonWhoWon()); 
			    status.setText(game.getWinner());
			    topPanel.add(status); 
			    button1.setEnabled(false);
			}
		}
	    else 
		{
		    status = new JLabel("someone does not have cards!");
		    topPanel.add(status); 
          
		}

	}
	
    }
}

		

	    
		