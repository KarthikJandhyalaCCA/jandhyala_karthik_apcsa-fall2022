//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = -1;
		int even = -1;
		for (int i = 0; i<ray.size();i++) {
			if (((ray.get(i)%2) == 1) && odd == -1) {
				odd = i;
			}
		}
		for (int i = (ray.size()-1); i>odd; i--) {
			if (((ray.get(i)%2) == 0) && even == -1) {
				even = i;
			}
		}
		if (even == -1 || odd == -1) {
			return -1;
		}
		else {
			return even-odd;
		}
	}
}