//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = keyboard.nextInt();
		NumberShifter NS = new NumberShifter();
		int[] array = NS.makeLucky7Array(size);
		NS.shiftEm(array);
		System.out.println("Here is the shifted array: " + Arrays.toString(array));
		//add test cases
	}
}



