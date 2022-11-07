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
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.BLUE;
	}
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.BLUE;
	}
	
	public Block(int x, int y )
	{
		xPos = x;
		yPos = y;
		width = 0;
		height = 0;
		color = Color.BLUE;
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
	
	public void setPos( int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void setX( int x ) {
		xPos = x;
	}
	public void setY( int y ) {
		yPos = y;
	}
	
	//add other Block constructors - x , y , width, height, color
	
   //add the other set methods
   
   public int getX() {
	   return xPos;
   }
   public int getY() {
	   return yPos;
   }
   public int getWidth() {
	   return width;
   }
   public int getHeight() {
	   return height;
   }
   public Color getColor() {
	   return color;
   }
   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   window.setColor(col);
   }
   
	public boolean equals(Object obj)
	{
		if (xPos == ((Block) obj).getX() && yPos == ((Block) obj).getY() && width == ((Block) obj).getWidth() && height == ((Block) obj).getHeight()) {
			return true;
		}
		else {
			return false;
		}
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	
}