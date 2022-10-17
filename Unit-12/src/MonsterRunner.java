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
		
		out.print("\nEnter the name for Monster 1:: ");
		String word1 = keyboard.next();	
		
		out.print("\nEnter the size for Monster 1:: ");
		int num1 = keyboard.nextInt();
		
		Monster m1 = new Skeleton(num1, word1);
		
		out.print("\nEnter the name for Monster 2:: ");
		String word2 = keyboard.next();	
		
		out.print("\nEnter the size for Monster 2:: ");
		int num2 = keyboard.nextInt();
		
		Monster m2 = new Skeleton(num2, word2);
		
		out.println(m1.toString(m2));
	}
}