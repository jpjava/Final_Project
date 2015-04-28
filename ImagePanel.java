import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel 
{
    private BufferedImage image= null; 
    protected void painComponent(Graphics g) 
    {
	super.paintComponent(g); 
		g.drawImage(image, 0, 0, null); 
    }
    
    public void setImage(BufferedImage newImage) 
    {
	image = newImage; 
    }
}
