//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for (int i= number; i>0; i = i/10) {
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int count = getNumDigits(number);
		int[] sorted = new int[count];
		for (int i= 0; i<count; i++) {
			sorted[i] = number%10;
			number = number/10;
		}
		for (int i=1; i< sorted.length; ++i)
		   {
		      int val = sorted[i];
		      int j=i;
		      while(j>0&&val<sorted[j-1]){         
		         sorted[j]=sorted[j-1];
		         j--;
		      }
		      sorted[j]=val;
		   }

		return sorted;
	}
}