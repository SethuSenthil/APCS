public class Tortoise
{

	private int speed, position;

	public Tortoise()
	{
		position = 0;
		speed = (int)(Math.random()*3) + 2;
	}

	public int getSpeed()
	{
		return speed;
	}

	public int getPosition()
	{
		return position;
	}

	public void move()
	{
		position += speed;
	}

	public String toString()
	{
		return "Tortoise: " + position;
	}

}