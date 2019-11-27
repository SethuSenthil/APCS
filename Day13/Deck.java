import java.util.ArrayList;

public class Deck
{
	private ArrayList<Card> cards;

	public Deck()
	{
		cards = new ArrayList<Card>();
		for (int i = 0; i < 52; i ++)
		{
			if (i/13 == 0)
				cards.add(new Card(i%13,"Hearts"));
			else if (i/13 == 1)
				cards.add(new Card(i%13,"Spades"));
			else if (i/13 == 2)
				cards.add(new Card(i%13,"Clubs"));
			else
				cards.add(new Card(i%13,"Diamonds"));
		}
	}

	public void shuffle()
	{
		for (int i = 0; i < 200; i ++)
			cards.add(cards.remove( (int)(Math.random()*cards.size() )));
	}


	public ArrayList<Card> getCards()
	{
		return cards;
	}

}