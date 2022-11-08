//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	   super(10,10);
       speed =5;
   }
   
   public Paddle(int x, int y)
   {
	   super(x, y);
       speed =5;
   }
   
   public Paddle(int x, int y, int w)
   {
	   super(x, y, w, 0);
       speed =5;
   }
   
   public Paddle(int x, int y, int w, int h)
   {
	   super(x, y, w, h);
       speed =5;
   }
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x, y, w, h);
       speed =s;
   }
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x, y, w, h, c);
       speed =s;
   }
   //add the other Paddle constructors







   public void setSpeed(int s)
   {
	   speed = s;
   }



   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, getColor());
	   setY(getY() + speed);
	   draw(window, getColor());
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, getColor());
	   setY(getY() - speed);
	   draw(window, getColor());
   }

   //add get methods
   
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + speed;
	}
}