//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   out.println("Enter a character: ");
	   char c = keyboard.next().charAt(0);
	   out.println("Enter a number: ");
	   int num = keyboard.nextInt();
	   TriangleFive TF = new TriangleFive();
	   TF.setLetter(c);
	   TF.setAmount(num);
	   out.println(TF);
	}
}