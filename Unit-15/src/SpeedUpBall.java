//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y, 0, 0 ,new Color(0,0,0), xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y, wid, ht ,new Color(0,0,0), xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y, wid, ht ,col, xSpd, ySpd);


   }

   public void setXSpeed( int xSpd )
   {
	   if (this.getXS() >0) {
		   super.setXS(getXS()+1);
	   }
	   else {
		   super.setXS(getXS()-1);   
	   }
   }

   public void setYSpeed( int ySpd )
   {
	   if (this.getYS() >0) {
		   super.setYS(getYS()+1);
	   }
	   else {
		   super.setYS(getYS()-1);   
	   }
   }
}

