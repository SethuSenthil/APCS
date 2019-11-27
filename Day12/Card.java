//class header. name of your object
public class Card
{
	//class or "instance" variables, aka fields
	//ALWAYS PRIVATE!
	private int value;
	private String suit;
	private String color;

	//constructor - how to make a card
	public Card(int v, String s)
	{
		value = v + 1;
		suit = s;
		if (s.equals("Hearts") || s.equals("Diamonds"))
			color = "Red";
		else
			color = "Black";
	}

	//Accessor or "Getter" methods
	//used to obtain information about the object
	public int getValue()
	{
		return value;
	}

	public String getSuit()
	{
		return suit;
	}

	public String getColor()
	{
		return color;
	}

	//toString() allows you to print or println
	//instances of the object
	public String toString()
	{
		switch(value)
		{
			case 1 : return "Ace of "+suit;
			case 11 : return "Jack of "+suit;
			case 12 : return "Queen of "+suit;
			case 13 : return "King of "+suit;
		}
		return value + " of " + suit;
	}







}