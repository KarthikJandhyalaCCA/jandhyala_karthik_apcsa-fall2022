//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		if ((word.length()%2) == 1) {
 			return false;
 		}
 		else {
 			return true;
 		}
 	}

 	public String toString()
 	{
 		if (isEven() == true) {
 			String output="even";
 	 		return output;
 		}
 		else {
 			String output="odd";
 	 		return output;
 		}
 		
	}
}