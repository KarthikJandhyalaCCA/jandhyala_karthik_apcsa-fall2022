//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int row = keyboard.nextInt();
		System.out.println("Enter the column size: ");
		int column = keyboard.nextInt();
		String[] values = new String[row*column];
		int i = 0;
		while(i<(row*column)) {
			int x = (int) (Math.random()*100);
			if ((x>47 && x<58) || (x>64 && x<91)){
				values[i] = String.valueOf(x);
				i++;
			}
		}
		Grid g = new Grid(row, column, values);
		out.println(g.toString(values));
	}
}