//Quincy Mattor
//java
//3/31/21

package wordScamble;

import java.util.Scanner;

public class Menu_Mattor {
	Scanner s = new Scanner(System.in);

	public void menu(String file, player_Mattor p) {
		int score = 0;
		WordScramble_Mattor ws = new WordScramble_Mattor(file);
		String input;
		System.out.println("Please enter your name:");
		input = s.nextLine();
		while (true) {
			System.out.println("Please enter your selection. \"play\", \"exit\",or \"view\"score");
			input = s.next();
			input = input.toUpperCase();
			if (input.equals("PLAY")) {
				if (ws.playGame())
					score++;
			} else if (input.equals("EXIT")) {
				System.out.println("Your final score is: " + score);
				p.setHighScore(score);
				ws.close();
				System.exit(0);
			} else if (input.equals("VIEW"))
				System.out.println("Your current score is: " + score);
			else
				System.out.println("invalid input");
		}
	}
	/* //this is the test main for the menu
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String in;
		Menu_Mattor m = new Menu_Mattor();
		System.out.println("Please enter the file to play with:");
		in = sc.nextLine();
		player_Mattor p = new player_Mattor("player 1");
		m.menu(in, p);
	}
	*/
}
