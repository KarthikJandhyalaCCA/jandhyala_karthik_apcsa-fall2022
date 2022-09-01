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
		
		LR.setRemover("ssssssssxssssesssssesss", 's');
		out.println("ssssssssxssssesssssesss - letter to remove s");
		out.println(LR.toString());
		
		LR.setRemover("qwertyqwertyqwerty", 'a');
		out.println("qwertyqwertyqwerty - letter to remove a");
		out.println(LR.toString());
		
		LR.setRemover("abababababa", 'b');
		out.println("abababababa - letter to remove b");
		out.println(LR.toString());
		
		LR.setRemover("abababababa", 'x');
		out.println("abababababa - letter to remove x");
		out.println(LR.toString());
	}
}