//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount check = new Discount();
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.printf("Bill after discount :: %.2f\n", check.getDiscountedBill(amt));

	}
}