import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test1;
		test1 = new ArrayList<Integer>();
		int[] arr1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		for (int i = 0; i<arr1.length; i++) {
			test1.add(arr1[i]);
		}
		System.out.println(ListDown.go(test1));
		
		ArrayList<Integer> test2;
		test2 = new ArrayList<Integer>();
		int[] arr2 = {10,9,8,7,6,5,4,3,2,1,-99};
		for (int i = 0; i<arr2.length; i++) {
			test2.add(arr2[i]);
		}
		System.out.println(ListDown.go(test2));
		
		ArrayList<Integer> test3;
		test3 = new ArrayList<Integer>();
		int[] arr3 = {10,20,30,40,50,-11818,40,30,20,10};
		for (int i = 0; i<arr3.length; i++) {
			test3.add(arr3[i]);
		}
		System.out.println(ListDown.go(test3));
		
		ArrayList<Integer> test4;
		test4 = new ArrayList<Integer>();
		int[] arr4 = {32767};
		for (int i = 0; i<arr4.length; i++) {
			test4.add(arr4[i]);
		}
		System.out.println(ListDown.go(test4));
		
		ArrayList<Integer> test5;
		test5 = new ArrayList<Integer>();
		int[] arr5 = {255,255};
		for (int i = 0; i<arr5.length; i++) {
			test5.add(arr5[i]);
		}
		System.out.println(ListDown.go(test5));
		
		ArrayList<Integer> test6;
		test6 = new ArrayList<Integer>();
		int[] arr6 = {9,10,-88,100,-555,1000};
		for (int i = 0; i<arr6.length; i++) {
			test6.add(arr6[i]);
		}
		System.out.println(ListDown.go(test6));
		
		ArrayList<Integer> test7;
		test7 = new ArrayList<Integer>();
		int[] arr7 = {10,10,10,11,456};
		for (int i = 0; i<arr7.length; i++) {
			test7.add(arr7[i]);
		}
		System.out.println(ListDown.go(test7));
		
		ArrayList<Integer> test8;
		test8 = new ArrayList<Integer>();
		int[] arr8 = {-111,1,2,3,9,11,20,30};
		for (int i = 0; i<arr8.length; i++) {
			test8.add(arr8[i]);
		}
		System.out.println(ListDown.go(test8));
		
		ArrayList<Integer> test9;
		test9 = new ArrayList<Integer>();
		int[] arr9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		for (int i = 0; i<arr9.length; i++) {
			test9.add(arr9[i]);
		}
		System.out.println(ListDown.go(test9));
		
		ArrayList<Integer> test10;
		test10 = new ArrayList<Integer>();
		int[] arr10 = {12,15,18,21,23,1000};
		for (int i = 0; i<arr10.length; i++) {
			test10.add(arr10[i]);
		}
		System.out.println(ListDown.go(test10));
		
		ArrayList<Integer> test11;
		test11 = new ArrayList<Integer>();
		int[] arr11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		for (int i = 0; i<arr11.length; i++) {
			test11.add(arr11[i]);
		}
		System.out.println(ListDown.go(test11));
		
		ArrayList<Integer> test12;
		test12 = new ArrayList<Integer>();
		int[] arr12 = {9,10,-8,10000,-5000,1000};
		for (int i = 0; i<arr12.length; i++) {
			test12.add(arr12[i]);
		}
		System.out.println(ListDown.go(test12));
	}
}