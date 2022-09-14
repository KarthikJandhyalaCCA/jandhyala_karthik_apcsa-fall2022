//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int largest = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (i == 0) {
				largest = numArray[i];
			}
			else if ((numArray[i] - largest) >= 0) {
				return false;
			}
		}
		return true;
	}	
}