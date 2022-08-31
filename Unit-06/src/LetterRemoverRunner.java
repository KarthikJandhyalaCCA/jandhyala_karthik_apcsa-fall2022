//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover LR = new LetterRemover();
		LR.setRemover("I am Sam I am", 'a');
		out.println("I am Sam I am - letter to remove a");
		out.println(LR.toString());
		
											
	}
}