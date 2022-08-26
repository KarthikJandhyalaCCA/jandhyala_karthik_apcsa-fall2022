//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	    Scanner keyboard = new Scanner(System.in);
		out.println("Enter Word 1:: ");
		String word1 = keyboard.next();
		out.println("Enter Word 2:: ");
		String word2 = keyboard.next();
		WordsCompare check = new WordsCompare(word1, word2);
		out.println(check);
	}
}