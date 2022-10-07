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
		loadToys("");
	}

	public void loadToys( String toys )
	{
		Toy t = new Toy(toys);
		toyList.add(t);
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
  		int[] arr = new int[toyList.size()];
  		for (int i = 0; i<toyList.size(); i++) {
  			
  		}
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}