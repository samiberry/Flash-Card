import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Card
	{
	static 	int numberCorrect = 0;
	static String correct;
	private String frontCard;
	private String backCard;
	public Card (String fc, String bc)
		{
		frontCard = fc;
		backCard = bc;
		}
	public String getFrontCard()
		{
		return frontCard;
		}
	public String getBackCard()
		{
		return backCard;
		}
	public static void answer()
		{
		try
			{
			TimeUnit.SECONDS.sleep(3);
			} 
		catch (InterruptedException e)
			{
			// Handle exception
			}
		}
	public static void didYouAnswerCorrectly()
	{
		System.out.println();
		System.out.println("Did you get the answer right?");
		Scanner userInput1=new Scanner(System.in);
		correct = userInput1.nextLine();
		if(correct.equals("yes"))
			{
			numberCorrect++;
			}
	}
	}
