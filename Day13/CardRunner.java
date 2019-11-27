public class CardRunner
{
	public CardRunner()
	{
		/*
		Card card1 = new Card(3,"Hearts");
		System.out.println(card1);
		System.out.println(card1.getValue());
		*/
		Deck deck = new Deck();
		Hand hand = new Hand();
		for (Card card : deck.getCards() )
			System.out.println(card);
	       hand.addCard(card);
	}



	public static void main(String[] args)
	{
		CardRunner app = new CardRunner();
	}
}