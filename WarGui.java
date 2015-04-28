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
    private ImagePanel card1, card2; 
    
    private JButton button1, button2; //so there are 2 buttons
    private JLabel status; //game status
    private JLabel title; //static title

public WarGui() 
{  
    
     
    topPanel = new JPanel(); 
    topPanel.setBackground(Color.green); //Since Dr. Horton's favorite color is green
    
    //no reason for this size just something to start off as
    gamePanel = new JPanel(); 
    
    button1 = new JButton(); 
    button2 = new JButton(); 
    
    title = new JLabel("This Means WAR!!!!!"); 
    title.setFont(new Font("HELVETICA", Font.ITALIC, 36)); 
    topPanel.add(title);
    
    status = new JLabel("Game in prgoress"); 
    status.setFont(new Font("ARIAL", Font.ITALIC, 36));
    topPanel.add(title); 
    
    card1 = new ImagePanel(); 
    
    card2 = new ImagePanel(); 
    
    add(topPanel); 
    add(gamePanel); 
gamePanel.add(card1, card2); 
}
private class ButtonListener1 implements ActionListener
{
public void actionPerformed(ActionEvent e) 
{

button1



public class warGuiTester extends JFrame

{
public  void main(String[] args)     {
	JFrame frame = new WarGui();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.pack(); 
	frame.setVisible(true); 
    }
}
}