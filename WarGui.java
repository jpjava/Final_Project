/**
   Justin Pappano
   My Card GUI!!!!!
   CS110
*/

public class WarGui
{
    public static void main(String[] args)
    {
	JFrame frame = new MyFrame("WAR CARDGAME");
	frame.setDefaultCloseOperation(JFrame.Exit_ON_CLOSE); 
	frame.pack(); 
	frame.setVisible(true); 
    }
}

class MyFrame extends JFrame
{
    private JPanel