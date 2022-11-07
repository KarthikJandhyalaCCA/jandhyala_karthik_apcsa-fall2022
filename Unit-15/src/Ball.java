//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y, w, h);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c)
	{
		super(x,y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color c, int xS, int yS)
	{
		super(x,y, w, h, c);
		xSpeed = xS;
		ySpeed = yS;
	}
	
	
   //add the set methods
   public void setXS(int xS) {
	   xSpeed = xS;
   }
   public void setYS(int yS) {
	   ySpeed = yS;
   }
   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(getColor());
      window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   //window.setColor(Color.black);
	   window.clearRect(getX(), getY(), getWidth(), getHeight());
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
		//draw the ball at its new location
	   window.fillOval(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		if (xSpeed == ((Ball) obj).getXS() && ySpeed == ((Ball) obj).getYS() && getX() == ((Block) obj).getX() && getY() == ((Block) obj).getY() && getWidth() == ((Block) obj).getWidth() && getHeight() == ((Block) obj).getHeight()) {
			return true;
		}
		else {
			return false;
		}
	}   

   //add the get methods
	public int getXS() {
	   return xSpeed;
	}
    public int getYS() {
	   return ySpeed;
	}
   //add a toString() method
    public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}
}