import java.util.Scanner;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow tr = new TotalRow();
		int[][] test1 = {{1,2,3},{5,5,5,5}};
		System.out.println("Row totals are :: " + tr.getRowTotals( test1 ));
		
		int[][] test2 = {{1,2,3},{5},{1},{2,2}};
		System.out.println("Row totals are :: " + tr.getRowTotals( test2 ));
		
		int[][] test3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println("Row totals are :: " + tr.getRowTotals( test3 ));
		//add code here
	}
}



