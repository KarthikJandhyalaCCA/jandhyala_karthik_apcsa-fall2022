//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	public int size;
	public String name;
	//add a constructor
	public Skeleton() {
		name = "";
		size = 0;
	}
	
	public Skeleton(int num, String S) {
		name = S;
		size = num;
	}
	//add code to implement the Monster interface
	
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other2) {
		if(getHowBig() > other2.getHowBig()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Monster other2) {
		if(getHowBig() < other2.getHowBig()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean namesTheSame(Monster other2) {
		if(getName().equals(other2.getName())) {
			return true;
		}
		else {
			return false;
		}
	}
	//add a toString
	
	public String toString(Monster m2){
		if (isBigger(m2) && namesTheSame(m2)) {
			return "Monster 1 is bigger than Monster 2\n" + "Monster 1 has the same name as Monster 2";
		}
		else if (isBigger(m2) && !(namesTheSame(m2))){
			return "Monster 1 is bigger than Monster 2\n" + "Monster 1 does not have the same name as Monster 2";
		}
		else if (!(isBigger(m2)) && namesTheSame(m2)){
			return "Monster 1 is not bigger than Monster 2\n" + "Monster 1 has the same name as Monster 2";
		} 
		else{
			return "Monster 1 is not bigger than Monster 2\n" + "Monster 1 does not have the same name as Monster 2";
		}
	}
}