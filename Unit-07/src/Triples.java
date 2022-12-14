//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   //private int a_val, b_val, c_val;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	/*public String pythagoreanT(int a, int b, int c) {
		if (((a%2 == 1) && (b%2 ==0)) || ((a%2 == 0) && (b%2 ==1))) {
			boolean checkGCF = greatestCommonFactor(a, b, c);
			if (checkGCF == false) {
				return a + " " + b + " " + c;
			}
		}
		return "";
	}*/
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int i = 1; i <= a || i <= b || i <=c; i++) {
		      if (a % i == 0 && b % i == 0 && c%i == 0) {
		    	  max = i;
		      }
		}
		    
		return max==1;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a <= number; a++) {
			for (int b = a+1; b <= number; b++) {
				for (int c = b+1; c<=number; c++) {
					if(a*a+b*b==c*c && greatestCommonFactor(a,b,c)){
						 output = output + a + " " + b + " " + c + "\n";
					}
				}
			}
		}
		
		return output+"\n";
	}
}