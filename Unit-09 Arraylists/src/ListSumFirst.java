//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		int check = ray.get(0);
		for (int i = 0; i<ray.size(); i++) {
			if(ray.get(i) > check) {
				sum += ray.get(i);
			}
		}
		if (sum != 0) {
			return sum;
		}
		else{
			return -1;
		}
	}
}