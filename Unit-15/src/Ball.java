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
   /*public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(getColor());
      window.fillOval(getX(), getY(), getWidth(), getHeight());
   }*/
   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   //window.setColor(Color.black);
	   draw(window);
	   window.clearRect(getX(), getY(), getWidth(), getHeight());
	   setX(getX()+xSpeed);
	   setY(getY()+ySpeed);
		//draw the ball at its new location
	   //window.fillRect(getX(), getY(), getWidth(), getHeight());
	   draw(window);
   }
   
	public boolean equals(Ball obj)
	{
		if(this.getXS()==obj.getXS() && this.getYS()==obj.getYS()) {
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXS() {
	   return xSpeed;
	}
    public int getYS() {
	   return ySpeed;
	}
    
    public void randomColor()
	   {
	   		int r = (int)(Math.random()*256);		//use Math.random()
	 		int g = (int)(Math.random()*256);
	 		int b = (int)(Math.random()*256);
	 		setColor(new Color(r,g,b));
	   }

	public boolean didCollideLeft(Object obj) {
		Block b = (Block)obj;
		if(this.getX()>b.getX() && this.getX()<=b.getX()+b.getWidth() && (this.getY()+this.getHeight()>b.getY() && this.getY()<b.getY()+b.getHeight())) {
			return true;
		}
		return false;
	}

	public boolean didCollideRight(Object obj) {
		Block b = (Block)obj;
		if(this.getX()<b.getX() && this.getX()+this.getWidth()>=b.getX() && (this.getY()+this.getHeight()>b.getY() && this.getY()<b.getY()+b.getHeight())) {
			return true;
		}
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Block b = (Block)obj;
		if((this.getY()<b.getY()) && (this.getY()+this.getHeight()>=b.getY() && (this.getX()+this.getWidth()>b.getX() && this.getX()<b.getX()+b.getWidth()))) {
			return true;
		}
		return false;
	}

	public boolean didCollideBottom(Object obj) {
		Block b = (Block)obj;
		if((this.getY()>b.getY()) && (this.getY()<=b.getY()+b.getHeight() && (this.getX()+getWidth()>b.getX() && this.getX()<b.getX()+b.getWidth()))) {
			return true;
		}
		return false;
	}
    
   //add a toString() method
    public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + xSpeed + " " + ySpeed;
	}
}