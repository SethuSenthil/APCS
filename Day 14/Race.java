public class Race
{
	public Race()
	{
		Hare hare = new Hare();
		Tortoise tort = new Tortoise();
		String winner = "";
		System.out.println("Ready, Set, GO!");
		while(hare.getPosition() < 100 && tort.getPosition() < 100)
		{
			hare.move();
			tort.move();
			System.out.println(tort + "\t" + hare);
			if (tort.getPosition() >= 100)
				winner += "Tortoise";
			if (hare.getPosition() >= 100)
				winner += "Hare";
		}
		if (winner.equals("TortoiseHare"))
			System.out.println("It's a tie!");
		else
			System.out.println("The winner is The " + winner);

	}

	public static void main(String[] args)
	{
		Race app = new Race();
	}
}