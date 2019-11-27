import java.util.ArrayList;
public class Hand
{
		private int maxCards;
		private ArrayList<Card>cards;

		public Hand()
		{
			this(5);
		}

		public Hand(int m)
		{
			maxCards = m;
			cards = new ArrayList<Card>();
		}

		public void addCard(Card c)
		{
			cards.add(c);
		}

		public int getMaxCards()
		{
			return maxCards;
		}

		public ArrayList<Card> getCards()
		{
			return cards;
		}

		public String toString()
		{
			String s = "";
			for(Card c : cards)
				s +=c + "\t";
			return s;
		}


}