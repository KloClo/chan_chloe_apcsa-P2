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
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player.toUpperCase();
		
		int num = (int)(Math.random()*3);
		
		if (num == 0) {
			compChoice = "R";
		}
		else if (num == 1) {
			compChoice = "P";
		}
		else if (num == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice.equals(compChoice)) {
			winner = "draw";
		}
		else if (playChoice.equals("R") && compChoice.equals("S")) {
			
		}
		
		//give all cases above
		
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}