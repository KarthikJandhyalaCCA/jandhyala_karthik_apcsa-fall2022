//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter the word: ");
		String word = keyboard.next();
		test.setString(word);
		out.print(test.toString());
	}
}