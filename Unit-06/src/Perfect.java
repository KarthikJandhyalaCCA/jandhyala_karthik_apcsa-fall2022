//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   public Perfect(int s) {
	   number = s;
   }
   public void set(int s) {
	   number = s;
   }
	//add a set method

	public boolean isPerfect()
	{
		int count = 0;
		for (int i = 1; i<number; i++) {
			if(number%i == 0) {
				count += i;
			}
		}
		if (number == count) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		isPerfect();
		if (isPerfect()) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
	}

	//add a toString	
	
}