//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/words.dat"));

		int size = file.nextInt();
		
		Word[] strarr = new Word[size];
		
		for (int i = 0; i<size; i++) {
			strarr[i] = ( new Word(file.nextLine()));
		}
		 
		 Arrays.sort(strarr);
		 
		for (int k = 0; k<size; k++) {
			out.println(strarr[k].toString());
		}
	}
}