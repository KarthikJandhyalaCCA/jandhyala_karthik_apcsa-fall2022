import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner {
	public static void main(String args[]) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int check = keyboard.nextInt();
		MatrixCount1 m1 = new MatrixCount1();
		System.out.println("The number " + check + " has a count of " + m1.count(check) + " times");
		// add code
	}
}
