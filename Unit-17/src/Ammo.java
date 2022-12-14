//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private Image image;
	private boolean exists = false;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		super(x,y);
	}

	public Ammo(int x, int y, int s)
	{
		super(x,y);
		setSpeed(s);
		try
		{
			URL url = getClass().getResource("/images/pu.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("Error!!! Go to Ammo");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setExist(boolean b)
	{
	   exists = b;
	}

	public boolean getExist()
	{
	   return exists;
	}

	public void draw( Graphics window )
	{
		window.fillRect(getX()+4,getY(),10, 15);
	}
	
	public void move( String direction )
	{
		setY(getY() - getSpeed());
	}

	public String toString()
	{
		return "";
	}
}
