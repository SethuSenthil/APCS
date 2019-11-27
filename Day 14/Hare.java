public class Hare
{
	private int speed, position;
	
	public Hare()
	{
		position = 0;
		speed = 10;
	}
	
	public int getPosition()
	{
		return position;
	}
	
	public void move()
	{
		int a = (int)(Math.random()*3) + 1;
		if (a == 3)
			position += speed;
	}
	
	public String toString()
	{
		return "Hare: " + position;
	}
}