//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for( String s: toys.split( " " )) {
			Toy t = getThatToy(s);
			if(t==null) {
				toyList.add(new Toy(s));
			}
			else
				t.setCount(t.getCount()+1);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i =0; i<toyList.size(); i++) {
  			if (toyList.get(i).getName() == nm) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int check = toyList.get(0).getCount();
  		int j = 0;
  		for (int i = 0; i<toyList.size(); i++) {
  			if ((toyList.get(i).getCount())>check) {
  				check = toyList.get(i).getCount();
  				j = i;
  			}
  		}
  		
  		return toyList.get(j).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int i = 0; i<toyList.size(); i++) {
  			for (int j = 1; j<toyList.size(); j++) {
  				if (toyList.get(j).getCount()<toyList.get(j-1).getCount()) {
  					Collections.swap(toyList, j, j-1);
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   sortToysByCount();
	   return toyList.toString() + "\nmax == " + getMostFrequentToy();
	}
}