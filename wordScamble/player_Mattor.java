//Quincy Mattor
//java
//3/31/21
package wordScamble;

public class player_Mattor extends person_Mattor{
	private int highScore = 0;
	public player_Mattor(String name)
	{
		super(name);
	}
	public int getHighScore()
	{
		return highScore;
	}
	public void setHighScore(int hs)
	{
		if (hs > highScore)
			highScore = hs;
		else
			System.out.println("Was not a High score; score not added");
	}
}
