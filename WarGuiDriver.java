
/**
   Justin Pappano
   CS110
   FInal Project

   This is the Driver for my gui
*/


import javax.swing.*;
import java.awt.*; 

public class WarGuiDriver
{
    public static void main(String[] args)     
    {
	JFrame frame = new WarGui();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.pack(); 
	frame.validate();
	frame.setVisible(true); 

    }
}
