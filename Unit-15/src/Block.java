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
		setPos(0,0);
		width = 0;
		height = 0;
		setColor(new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h)
	{
		setPos(x,y);
		width = w;
		height = h;
		setColor(new Color(0,0,0));
	}
	
	public Block(int x, int y )
	{
		setPos(x,y);
		width = 0;
		height = 0;
		setColor(new Color(0,0,0));
	}
	
	public Block(int x, int y, int w, int h, Color c)
	{
		setPos(x,y);
		width = w;
		height = h;
		setColor(c);
	}
	
	public Block(Color c)
	{
		setPos(0,0);
		setX(0);
		setY(0);
		setColor(c);
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
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block b = (Block)obj;
		if(this.getX()==b.getX() && this.getY()==b.getY() && this.getWidth()==b.getWidth() && this.getHeight()==b.getHeight()) {
			return true;
		}
		return false;
	}
	
	public void drawScore(Graphics window, int p1, int p2) {
		   
		   window.drawString("player1 :: "+p1+"\n player2 :: "+p2, getX()+10, getY()+10);
	}
   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return " - "+xPos+", "+yPos+", "+", "+width+", "+height+", "+color; 
	}
}