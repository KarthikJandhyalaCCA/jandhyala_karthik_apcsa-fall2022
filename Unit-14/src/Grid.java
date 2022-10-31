import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		/*List<Integer> check_val = new ArrayList<>();
		for (int r = 0; r<rows; r++) {
			int c = 0;
			while (c<cols) {
				int x = (int) (Math.random()*cols);
				boolean check = false;
				for (int i = 0; i<check_val.size(); i++) {
					if (x == check_val.get(i)) {
						check = false;
					}
				}
				if (check){
					grid[r][c] = vals[x];
					check_val.add(x);
					c++;
				}
			}
		}*/
		int i = 0;
		for (int r = 0; r<rows; r++) {
			for (int c = 0; c<cols; c++) {
				int temp = Integer.parseInt(vals[i]);
				char temp1 = (char) temp; 
				grid[r][c] = String.valueOf(temp1);
				i++;
			}

		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		/*int count = 0;
		int[] check = new int[vals.length];
		String character = "";
		for (int i = 0; i<vals.length; i++) {
			int pass = 0;
			for (int j = 0; j<vals.length; j++) {
				if(vals[i] == vals[j]) {
					 pass++;
				}
			}
			check[i] = pass;
		}
		int check_pass = 0;
		for (int i = 0; i<vals.length; i++) {
			if (check[i] > check_pass) {
				check_pass = i;//PROBLEM
			}
		}
		int temp = Integer.parseInt(vals[check_pass]);
		char temp1 = (char) temp; 
		character = String.valueOf(temp1);
		//character = vals[check_pass];
		return character + " count is " + count;*/
		
		int temp = Integer.parseInt(vals[0]);
		char temp1 = (char) temp; 
		String max = String.valueOf(temp1);
		for (int i = 0; i<vals.length; i++) {
			int check = Integer.parseInt(vals[i]);
			char check1 = (char) check; 
			String test = String.valueOf(check1);
			if (countVals(test) > countVals(max)) {
				max = test;
			}
		}
		return max + " has the greatest count, with a count of : " + countVals(max);
	  	//return max;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count  = 0;
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[0].length; j++) {
				if (grid[i][j].equals(val)) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString(String[] vals)
	{
		String output="";
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[0].length; j++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		output += "\n" + findMax(vals);
		output += "\n" + "A has a count of " + countVals("A");
		output += "\n" + "F has a count of " + countVals("F");
		output += "\n" + "U has a count of " + countVals("U");
		output += "\n" + "6 has a count of " + countVals("6");
		return output;
	}
}