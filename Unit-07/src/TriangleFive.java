//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = '\0';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char a = letter;
		for (int total = 0; total < amount; total++) {
			for (int l = 0; l<amount-total; l++) {
				for (int c = amount; c>l; c--) {
					output +=(a);
				
				}
				output += '\t';
				a++;
			}
			a = letter;
			output += '\n';
		}
		return output;
	}
}