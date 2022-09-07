//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

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
		determineWinner();
		return compChoice;
	}

	public String determineWinner()
	{
		String winner = "";
		double choice = (3*Math.random());
		int decision = (int) choice;
		if (decision == 0) {
			compChoice = "R";
			if (playChoice.equals(compChoice)) {
				winner="!Draw Game!";
			}
			else{
					if (playChoice == "P") {
						winner="Player wins!";
					}
					else {
						winner="Computer wins!";
					}
			}
		}
		if (decision == 1) {
			compChoice = "P";
			if (playChoice.equals(compChoice)) {
				winner="!Draw Game!";
			}
			else{
				if (playChoice == "S") {
					winner="Player wins!";
				}
				else {
					winner="Computer wins!";
				}
		}
		}
		if (decision == 2) {
			compChoice = "S";
			if (playChoice.equals(compChoice)) {
				winner="!Draw Game!";
			}
			else{
				if (playChoice == "P") {
					winner="Player wins!";
				}
				else {
					winner="Computer wins!";
				}
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