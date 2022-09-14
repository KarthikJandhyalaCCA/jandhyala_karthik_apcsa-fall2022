//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = -1;
		int even = 0;
		int distance = -1;
		for (int i = 0; i<ray.length; i++) {
			if (ray[i]%2 == 1 && odd == -1) {
				odd = i;
			}
			if ((ray[i]%2 == 0) && odd != -1 && even == 0) {
				even = i;
				distance = even - odd;
			}
		}
		return distance;
	}
}