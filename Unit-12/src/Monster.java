//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public interface Monster
{
	public int getHowBig();
	public String getName();
	public boolean isBigger(Monster other2);	
	public boolean isSmaller(Monster other2);
	public boolean namesTheSame(Monster other2);
	public String toString(Monster other2);
}