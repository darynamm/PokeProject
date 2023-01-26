package poke.model;

public class Bulbasaur extends Pokemon implements Grass
{

	public Bulbasaur()
	{
		super(001, "Bulbasaur");
	}
	
	public Bulbasaur(String name)
	{
		super(001, name);
		
	}

	public Bulbasaur(int number, String name)
	{
		super(number, name);
	}
public int green(int greenAmount)
{
	return getHealth()*2 + greenAmount;
}
	}