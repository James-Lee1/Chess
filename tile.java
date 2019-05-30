import javax.swing.*;

// Togglebutton?
public class tile extends JButton
{
	// Change variables into preferably private
    private int xPosition;
    private int yPosition;
    private piece p;
    
    // Constructor
    public tile(int xPosition, int yPosition)
    {
    	this.xPosition = xPosition;
    	this.yPosition = yPosition;
    }
    
    // Returns x position of spot
    public int getXPos()
    {
    	return xPosition;
    }
    
    // Returns y position of spot
    public int getYPos()
    {
    	return yPosition;
    }
    
    public void addPiece(piece p)
    {
    	this.p = p;
    	this.setText(p.name());
    }
    
    public piece getPiece()
    {
    	return p;
    }
    
    public void removePiece()
    {
    	this.p = null;
    	this.setText("");
    }
    
    public void checkTile(piece p, int x, int y)
    {
        if(!p.name().equals(""))
        {
        	player.isValidMove(p, x, y);
        }
    }
}
