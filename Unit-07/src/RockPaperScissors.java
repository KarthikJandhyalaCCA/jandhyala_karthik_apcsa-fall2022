//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	//private int decision;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public String computerChoice() {
		double choice = (3*Math.random());
		int decision = (int) choice;
		if (decision == 0) {
			compChoice = "R";
		}
		if (decision == 1) {
			compChoice = "P";
		}
		if (decision == 2) {
			compChoice = "S";
		}
		return compChoice;
	}

	public String determineWinner()
	{
		String winner = "";
		if (compChoice.equals("R")) {
			if (playChoice.equals("R")) {
				winner="!Draw Game!";
			}
			else if (playChoice.equals("P")) {
				winner="Player wins!";
			}
			else {
				winner="Computer wins!";
			}
		}
		else if (compChoice.equals("P")) {
			if (playChoice.equals("P")) {
				winner="!Draw Game!";
			}
			else if (playChoice.equals("S")) {
				winner="Player wins!";
			}
			else {
				winner="Computer wins!";
			}
		}
		else if (compChoice.equals("S")) {
			if (playChoice.equals("S")) {
				winner="!Draw Game!";
			}
			else if (playChoice.equals("R")) {
				winner="Player wins!";
			}
			else {
				winner="Computer wins!";
			}
			
		}
		return winner;
	}
	
	
	
	public String toString()
	{
		String output = determineWinner();
		return output;
	}
}