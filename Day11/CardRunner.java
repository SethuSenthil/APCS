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
		deck.shuffle();
		for (Card card : deck.getCards() )
			System.out.println(card);


	}
	Jamd hand1 = new Hand();
	hand1.addCard(new Card(3, "Spades");
    hand1.addCard(new Card(3, "Spades");
    for(int i = 0; i < hand.getMaxCards(); i++){
         hend1.addCard(deck.deal());
	}

	public static void main(String[] args)
	{
		CardRunner app = new CardRunner();
	}
}