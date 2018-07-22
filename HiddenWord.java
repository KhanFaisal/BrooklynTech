import java.util.ArrayList;
public class HiddenWord 
{
	private String theWord;
	public HiddenWord(String myWord)
	{
		theWord = myWord;
	}
	public String getHint(String myGuess)
	{
		String theHint = "";
		if(myGuess.length() != theWord.length())
		{
			return "This guess is not the saame length";
		}
		//ArrayList<Integer> diffPos = new ArrayList<Integer>();
		//ArrayList<String> samePos = new ArrayList<Integer>();
		for(int i = 0; i < theWord.length(); i++)
		{
			String let = myGuess.substring(i, i+1);
			if(theWord.contains(let))
			{
				if(theWord.substring(i, i+1).equals(let))
				{
					theHint += theWord.substring(i, i+1);
				}
				else
				{
					theHint += "+";	
				}
			}
			else
			{
				theHint += "*";
			}
		}
		return theHint;
	}
}
