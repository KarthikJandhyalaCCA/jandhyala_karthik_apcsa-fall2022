//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a word :: ");
		String word = keyboard.next();
		StringOddOrEven stringOoE = new StringOddOrEven(word);
		out.printf(word +  " is %s", stringOoE);
	}
}