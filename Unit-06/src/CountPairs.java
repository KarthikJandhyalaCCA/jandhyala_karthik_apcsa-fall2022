//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 1; i<str.length(); i++) {
			if (str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
		}
		return count;
	}
}