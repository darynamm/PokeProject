package poke.model.monsters;

import poke.model.types.Grass;

public class Bulbasaur extends Pokemon implements Grass
{

	public Bulbasaur()
	{
		super(001, "Bulbasaur");
		setup(250, true);
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