//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		this.xOne = 0;
		this.yOne = 0;
		this.xTwo = 0;
		this.yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		this.xOne = x1;
		this.yOne = x2;
		this.xTwo = y1;
		this.yTwo = y2;
	}

	//public void setCoordinates(int x1, int y1, int x2, int y2)
	//{
	//}

	public void calcDistance()
	{
		int xSide = (this.xOne - this.xTwo);
		xSide = (int) Math.pow(xSide, 2);
		int ySide = (this.yOne - this.yTwo);
		ySide = (int) Math.pow(ySide, 2);
		distance = Math.pow((xSide+ySide), 0.5);
	}
	
	public double getDistance()
	{
		calcDistance();
		return distance;
	}
	
	public void print()
	{
		out.println("Distance: " + distance);
	}
	
	//complete print or the toString

	//public String toString()
	//{
	//}
}