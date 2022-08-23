//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph, time;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		this.distance = dist;
		this.hours = hrs;
		this.minutes = mins;
		setNums(this.distance, this.hours, this.minutes);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		time = (hours+(minutes/60.0));
		mph = (int) Math.round((distance/time));
	}

	public void print()
	{
		out.println(distance + " miles in " + hours + " hour(s) and " + minutes + " minutes"+ " = " + mph + " MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}