//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect perfect = new Perfect();
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter a number: ");
		int num = keyboard.nextInt();
		perfect.set(num);
		out.println(perfect.toString());
																
	}
}