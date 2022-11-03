//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i =0; i<wordRay.length-1; i++) {
			int min = i;
			for (int j = i+1; j<wordRay.length; j++) {
				if (wordRay[j].compareTo(wordRay[min]) > 0) {
					min = j;
				}
			}
			if (min != i) {
				String temp = wordRay[min];
				wordRay[min] = wordRay[i];
				wordRay[i] = temp;
			}
		}
	}

	public String toString()
	{
		String output="";
		sort();
		for (int i = wordRay.length-1; i>=0; i--) {
			output += wordRay[i] + "\n";
		}
		return output+"\n\n";
	}
}