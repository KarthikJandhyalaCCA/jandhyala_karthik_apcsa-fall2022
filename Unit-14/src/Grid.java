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
		List<Integer> check_val = new ArrayList<>();
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
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count  = 0;
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[0].length; i++) {
				if (grid[i][j] == val) {
					count++;
				}
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i<grid.length; i++) {
			for (int j = 0; j<grid[0].length; i++) {
				output += grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}