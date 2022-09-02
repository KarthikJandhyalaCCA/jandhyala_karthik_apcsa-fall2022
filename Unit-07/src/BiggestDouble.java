//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double OorT = Math.max(one, two);
		double TorF = Math.max(three, four);
		double last = Math.max(OorT, TorF);
		return last;
	}
	
	public String inputs(){
		String oneS = String.valueOf(one);
		String twoS = String.valueOf(two);
		String threeS = String.valueOf(three);
		String fourS = String.valueOf(four);

		return oneS + ", " + twoS + ", " + threeS + ", " + fourS; 
	}
	
	public String toString()
	{
		double x = getBiggest();
		String str = String.valueOf(x);  
	    return str;
	}
}