import java.util.ArrayList;

public class Hand
{
	private ArrayList<Card> cards;
	private int maxCards = 0;

	public Hand(ArrayList<Card> cardss)
	{
		cards = cardss;
	}

	public String getMax(Card cardd)
	{
		return "" + maxCards;
	}

	public void adddCard(Card cardd)
	{
			cards.add(cardd);
			System.out.println();
			for(Card thisCard : cards){
				System.out.print("\t" + thisCard);
				}
	}

	public void deal()
	{
		cards.remove(0);
	}

}