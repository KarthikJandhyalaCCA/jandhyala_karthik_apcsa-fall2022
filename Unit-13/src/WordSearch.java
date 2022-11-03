//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	String[] temp = str.split("");
    	int val = 0;
    	for (int i = 0; i<size;i++) {
    		for (int j = 0; j<size;j++) {
        		m[i][j] = temp[val];
        		val++;
        	}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i<m.length; i++) {
    		for (int j = 0; j<m.length; j++) {
    			if (checkRight(word, i, j)  || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j)== true) {
    	    		return true;
    			}
        	}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			y++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			y--;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x++;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x--;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x--;
			y++;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x--;
			y--;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if (x<0 || y<0 || x>=m.length || y>=m.length) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x++;
			y--;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int x = r;
		int y = c;
		for (int i = 0; i<w.length(); i++) {
			if ((x<0 || y<0 || x>=m.length || y>=m.length)) {
				return false;
			}
			if (m[x][y].charAt(0) != w.charAt(i)) {
				return false;
			}
			x++;
			y++;
		}
		return true;
	}

    public String toString()
    {
    	String output = "";
    	for (int i = 0; i<m.length; i++) {
    		for (int j = 0; j<m.length; j++) {
    			output += m[i][j] + "  ";
    		}
    		output += "\n";
    	}
    	output += "\n";
 		return output;
    }
}
