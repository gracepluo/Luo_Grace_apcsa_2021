//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
      letter = ' ';
      amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
      letter = c;
      amount = amt;
	}

	public void setLetter(char c)
	{
      letter = c;
	}

	public void setAmount(int amt)
	{
      amount = amt;
	}

	public String toString()
	{
		String output="";
		char currentLetter = letter;
		
		for(int k = 1; k <= amount; k++){
			currentLetter = letter;
			for(int i = amount; i >= k; i--){
				for(int j = 0; j < i; j++){
					output += currentLetter;
				}
				output += " ";
				currentLetter++;
			}
			
			output += "\n";
		}
		return output;
	}
}
