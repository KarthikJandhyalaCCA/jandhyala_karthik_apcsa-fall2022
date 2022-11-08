//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import static java.lang.System.out;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
	private Ball ball;

	public BallTestTwo()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//instantiate a new Ball
		
		ball = new Ball(100,100,30,50,Color.BLUE,5,6);
		
		Ball four = new Ball(100,100,30,50,Color.BLUE);
		out.println(ball);
		
		Ball five = new Ball(100,100,30,50,Color.BLUE,5,6);
		out.println(ball);
		
									//x, y, wid, ht, color, xSpd, ySpd
		Ball six = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(six);		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));				

		//test the Ball thoroughly
		

		//test all constructors
		
		Ball ball = new Ball();
		out.println(ball);
		
		ball = new Ball(100,90);
		out.println(ball);
		
		ball = new Ball(100,100,30,50);
		out.println(ball);
		
		ball = new Ball(100,100,30,50,Color.BLUE);
		out.println(ball);
		
		ball = new Ball(100,100,30,50,Color.BLUE,5,6);
		out.println(ball);
		
		new Thread(this).start();
	}
	
	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		ball.moveAndDraw(window);

		if(!(ball.getX()>=10 && ball.getX()<=550))
		{
			ball.setXS(-ball.getXS());
		}

		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYS(-ball.getYS());
		}
	}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}