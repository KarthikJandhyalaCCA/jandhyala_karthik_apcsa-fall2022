//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   super(x,y);
	}

	public Ship(int x, int y, int s)
	{
		super(x,y);
		speed=s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error!!! Go to Ship and at Line 33");
		}
	}


	public void setSpeed( int s ) {
		speed = s;
	}
	 public int getSpeed() {
		 return speed;
	 }

	public void move(String direction)
	{
		if (direction.equals("W")) {
			setY(getY() + getSpeed());
		}
		else if (direction.equals("A")) {
			setX(getX() - getSpeed());
		}
		else if (direction.equals("S")) {
			setY(getY() - getSpeed());
		}
		else if (direction.equals("D")) {
			setX(getX() + getSpeed());
		}
		
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
