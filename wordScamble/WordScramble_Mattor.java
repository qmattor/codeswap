//Quincy Mattor
//java
//3/31/21

//it is possible that the file reading/writing system doesn't work
//I could not get it to find any files
//I don't believe this to be a fault of the code, but it means that it is untested

package wordScamble;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WordScramble_Mattor {
	private ArrayList<String> word;
	File file;
	FileInputStream in;
	PrintWriter pw;
	Scanner s;
	public WordScramble_Mattor()
	{
		s = new Scanner(System.in);
		word = new ArrayList<String>(1);
	}
	public WordScramble_Mattor(String fileName)
	{
		s = new Scanner(System.in);
		word = new ArrayList<String>(1);
		try {
			file = new File(fileName);
			in = new FileInputStream(file);
			pw = new PrintWriter(file);
		}
		catch (Exception e)
		{
			System.out.println("ERROR: file not found");
			System.exit(1);
		}
	}
	public String readWordFromFile()
	{
		String w = "";
		char c = 0;
		while (true) {
			try {
				c = (char) in.read();
			}
			catch (Exception e)
			{
				System.out.println("ERROR: ????");
			}
			if (c == -1 || Character.isWhitespace(c))
				break ;
			w += c;
		}
		word.add(w);
		return w;
	}
	public void writeWordToFile()
	{
		String nots;
		System.out.println("Please enter the text to be input");
		nots = s.next();
		pw.println(nots);
	}
	public void scrambleWord()
	{
		String s1, s2, s3, s4, result;
		for (int i = 0; i < word.size(); i++)
		{
			s1 = word.get(i).substring(0, word.get(i).length() / 4);
			s2 = word.get(i).substring(word.get(i).length() / 4, word.get(i).length() / 2);
			s3 = word.get(i).substring(word.get(i).length()/ 2, (int)(word.get(i).length() * (3.0/4)));
			s4 = word.get(i).substring((int)(word.get(i).length() * (3.0/4)), word.get(i).length());
			result = "";
			result += s2 + s4 + s1 + s3;
			word.set(i, result);
		}
	}
	public ArrayList<String> getWord()
	{
		return word;
	}
	public void setWord(ArrayList<String> s)
	{
		word = s;
	}
	public void close()
	{
		try
		{
			in.close();
		}
		catch (IOException e)
		{
			System.out.println("ERROR: you done goofed it");
		}
	}
	public boolean playGame()
	{
		String guess;
		readWordFromFile();
		System.out.println("The word is: " + word.get(word.size() - 1));
		scrambleWord();
		for (int i = 0; i < 3; i++) {
			System.out.println("enter your guess below");
			guess = s.next();
			if (s.equals(word.get(word.size() - 1))) {
				System.out.println("You WIN!!!");
				return true;
			} else {
				System.out.println("Incorrect");
			}
		}
		return false;
	}
	/* //main that test word scramble (only scramble function because windows file system sucks)
	public static void main(String args[])
	{
		WordScramble_Mattor ws = new WordScramble_Mattor();
		ArrayList<String> al = new ArrayList<String>(10);
		al.add("Test");
		al.add("ABCDEFGHIJK");
		al.add("supercalifragilistic");
		al.add("AB");
		al.add("");
		al.add("");//added some test cases
		ws.setWord(al);
		ws.scrambleWord();
		al = ws.getWord();
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));
	}
	*/
}
