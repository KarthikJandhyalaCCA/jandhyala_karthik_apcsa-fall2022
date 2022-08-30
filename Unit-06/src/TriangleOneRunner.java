//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;
import  java.util.Scanner;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne tri = new TriangleOne();
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter the word: ");
		String word = keyboard.next();
		tri.setWord(word);
		tri.print();
	}
}