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
   
   public Paddle(int x, int y, int w, int h)
   {
	   super(x, y, w, h);
       speed =5;
   }
   //add the other Paddle constructors







   public void setSpeed(int s)
   {
	   speed = s;
   }



   public void moveUpAndDraw(Graphics window)
   {


   }

   public void moveDownAndDraw(Graphics window)
   {


   }

   //add get methods
   
   
   //add a toString() method
}