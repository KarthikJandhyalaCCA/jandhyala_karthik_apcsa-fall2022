import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test1;
		test1 = new ArrayList<Integer>();
		int[] arr1 = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		for (int i = 0; i<arr1.length; i++) {
			test1.add(arr1[i]);
		}
		System.out.println(ListOddToEven.go(test1));
		
		ArrayList<Integer> test2;
		test2 = new ArrayList<Integer>();
		int[] arr2 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		for (int i = 0; i<arr2.length; i++) {
			test2.add(arr2[i]);
		}
		System.out.println(ListOddToEven.go(test2));
		
		ArrayList<Integer> test3;
		test3 = new ArrayList<Integer>();
		int[] arr3 = {10,20,30,40,5,41,31,20,11,7};
		for (int i = 0; i<arr3.length; i++) {
			test3.add(arr3[i]);
		}
		System.out.println(ListOddToEven.go(test3));
		
		ArrayList<Integer> test4;
		test4 = new ArrayList<Integer>();
		int[] arr4 = {32767,70,4,5,6,7};
		for (int i = 0; i<arr4.length; i++) {
			test4.add(arr4[i]);
		}
		System.out.println(ListOddToEven.go(test4));
		
		ArrayList<Integer> test5;
		test5 = new ArrayList<Integer>();
		int[] arr5 = {2,7,11,21,5,7};
		for (int i = 0; i<arr5.length; i++) {
			test5.add(arr5[i]);
		}
		System.out.println(ListOddToEven.go(test5));
		
		ArrayList<Integer> test6;
		test6 = new ArrayList<Integer>();
		int[] arr6 = {7,255,11,255,100,3,2};
		for (int i = 0; i<arr6.length; i++) {
			test6.add(arr6[i]);
		}
		System.out.println(ListOddToEven.go(test6));
		
		ArrayList<Integer> test7;
		test7 = new ArrayList<Integer>();
		int[] arr7 = {9,11,11,11,7,1000,3};
		for (int i = 0; i<arr7.length; i++) {
			test7.add(arr7[i]);
		}
		System.out.println(ListOddToEven.go(test7));
		
		ArrayList<Integer> test8;
		test8 = new ArrayList<Integer>();
		int[] arr8 = {7,7,7,11,2,7,7,11,11,2};
		for (int i = 0; i<arr8.length; i++) {
			test8.add(arr8[i]);
		}
		System.out.println(ListOddToEven.go(test8));
		
		ArrayList<Integer> test9;
		test9 = new ArrayList<Integer>();
		int[] arr9 = {2,4,6,8,8};
		for (int i = 0; i<arr9.length; i++) {
			test9.add(arr9[i]);
		}
		System.out.println(ListOddToEven.go(test9));
	}
}