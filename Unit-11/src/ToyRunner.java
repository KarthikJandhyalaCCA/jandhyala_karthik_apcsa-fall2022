//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Toy t = new Toy();
	   	String choice="";
		out.print("\nEnter a toy name :: ");
		String word = keyboard.next();
		//call the printWord method
		t.setName(word);
		
		out.print("\nEnter a toy count :: ");
		int count = keyboard.nextInt();
		//call the printWord method
		t.setCount(count);
		
		out.println(t.toString());
	}
}