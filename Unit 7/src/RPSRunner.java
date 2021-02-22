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
		String response = "";
		String player = "";
        String computer = "";
        int random = 0;
        RockPaperScissors game = new RockPaperScissors();

		
		//add in a do while loop after you get the basics up and running
		do {
			player = "";
			computer = "";
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S] :: ");
			
          
			//read in the player value
            player = keyboard.nextLine();
		
			random = (int)(Math.random() * 3);
          
          if (random == 0) {
            computer = "R";
          } else if (random == 1) {
            computer = "P";
          } else {
            computer = "S";
          }
          
          game.setPlayers(player);
          game.setComp(computer);
          game.toString();
          
            System.out.print("Do you want to play again? ");
            response = keyboard.nextLine();
        } while (response.equalsIgnoreCase("y"));
	}
}


