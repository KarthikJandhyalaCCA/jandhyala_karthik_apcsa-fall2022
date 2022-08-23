//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a whole number :: ");
		int check = keyboard.nextInt();
		out.println(check + " is odd :: " + NumberVerify.isOdd(check));
		out.println(check + " is even :: " + NumberVerify.isEven(check));
		
		//add in more test cases
	}
}