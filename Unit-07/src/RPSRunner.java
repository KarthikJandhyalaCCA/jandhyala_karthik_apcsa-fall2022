//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String player;
		String check = "y";
		RockPaperScissors game = new RockPaperScissors();
		do {
		out.println("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
		player = keyboard.next();
		game.setPlayers(player);
		out.println("Player chose " + player);
		out.println("Computer chooses " + game.computerChoice());
		out.println(game);
		out.println("Do you want to play again? ");
		check = keyboard.next();
		}
		while(check == "y");
		
		
		//add in a do while loop after you get the basics up and running

			
			//read in the player value
	
	}
}