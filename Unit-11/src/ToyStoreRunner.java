//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		ToyStore t = new ToyStore();
	   	String choice="";
		//call the printWord method
			out.print("Enter toyList :: ");
			String word = keyboard.next();
			t.loadToys(word);
			//call the printWord method
		
		out.println(t.toString());
	}
}