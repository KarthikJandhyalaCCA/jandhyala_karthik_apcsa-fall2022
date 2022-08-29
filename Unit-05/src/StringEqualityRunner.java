//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		String one, two;
		Scanner keyboard = new Scanner(System.in);
		StringEquality check = new StringEquality();
		out.println("Enter the first word: ");
		one = keyboard.next();
		out.println("Enter the second word: ");
		two = keyboard.next();
		check.setWords(one, two);
		out.println(check);
	}
}