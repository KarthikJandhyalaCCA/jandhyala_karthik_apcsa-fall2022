//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double rise = 100*(y2-y1);
		double run = (x2-x1);
		double m = rise/run;
		m = m/100;
		return m;
	}

}