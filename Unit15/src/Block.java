//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = yPos = width = height = 10;
		color = Color.BLACK;
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = height = 10;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
   //add the other set methods
    public void setPos( int x, int y)
    {
    	setX(x);
    	setY(y);
    }
    
    public void setX( int x )
    {
    	xPos = x;
    }
    
    public void setY( int y )
    {
    	yPos = y;
    }
    
    public void setW( int w )
    {
    	width = w;
    }
    
    public void setH( int h )
    {
    	height = h;
    }
    
    public void setColor(Color col)
    {
 	   color = col;
    }
    
    public int getX()
    {
    	return xPos;
    }
    
    public int getY()
    {
    	return yPos;
    }
    
    public int getW()
    {
    	return width;
    }
    
    public int getH()
    {
    	return height;
    }
    
    public Color getColor()
    {
    	return color;
    }

    //add the other get methods
    

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      //window.setColor(color);
      //window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{
		Paddle p = (Paddle)obj;
		if (xPos == p.getX() &&
			yPos == p.getY() &&
			height == p.getH() &&
			width == p.getW() &&
			color.equals(getColor())) return true;

		return false;
	}   

   //add a toString() method  - x , y , width, height, color
   public String toString()
   {
	   return xPos + " " + yPos + " " + " " + width + " " + height + " " + color ;
   }
}