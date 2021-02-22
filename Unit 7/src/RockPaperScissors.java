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
      playChoice = player.toUpperCase();
	}

	public void setPlayers(String player)
	{
      playChoice = player.toUpperCase();
	}
  
  	public void setComp(String computer)
	{
      compChoice = computer.toUpperCase();
	}

	public String determineWinner()
	{
			
		String winner ="";
		//win
	System.out.println("Play choice is " + playChoice);
	System.out.println("comp choice is " + compChoice);
      if (playChoice.equals("R")) {
    	  if ( compChoice.equals("S")) {
    		  winner="!Player wins <<Rock Breaks Scissors>>!";
    	  } else if (compChoice.equals("P")){
    	  		winner="!Computer wins <<Paper Covers Rock>>!";
    	  }	else{
    		  	winner = "!Draw Game!";
          }
    		  
      }else if (playChoice.equals("P")) {
       	  if ( compChoice.equals("S")) {
          	winner="!Computer wins <<Scissors Cuts Paper>>!";
    	  } else if (compChoice.equals("R")){
    	    winner="!Player wins <<Paper Covers Rock>>!";    
    	  }	else{
    		  	winner = "!Draw Game!";
          }

      }else { //S
       	  if ( compChoice.equals("P")) {
           	winner="!Player wins <<Scissors Cuts Paper>>!";
    	  } else if (compChoice.equals("R")){
    	    winner="!Computer wins <<Paper Covers Rock>>!";    
    	  }	else{
    	  	winner = "!Draw Game!";
          }

      }   
		return winner;


	}

	public String toString()
	{
		System.out.println("Player had " + playChoice);
		System.out.println("Computer had " + compChoice);
		System.out.println(determineWinner());
		return "";

	}
}
