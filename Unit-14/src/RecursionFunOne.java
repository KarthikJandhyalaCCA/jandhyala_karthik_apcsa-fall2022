//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int check = num%10;
		if (check%2 == 0 && num>0) {
			return 1 + countOddDigits(num/10);
		}
		else if (check%2 == 1 && num>0){
			return countOddDigits(num/10);
		}
		else {
			return 0;
		}
	}
}