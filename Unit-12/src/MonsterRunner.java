//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		out.print("\nEnter the name :: ");
		String word = keyboard.next();	
		
		out.print("\nEnter the size :: ");
		int num = keyboard.nextInt();
		
		Monster m1 = new Skeleton(num, word);
		//w.printTriangle(word);
		
		//instantiate monster one
		
		//ask for name and size
		
		//instantiate monster two
	}
}