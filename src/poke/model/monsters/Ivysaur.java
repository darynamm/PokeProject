package poke.model.monsters;

import poke.model.Pokemon;
import poke.model.types.Ghost;
import poke.model.types.Grass;
import poke.model.types.Poison;

public class Ivysaur extends Pokemon implements Ghost, Grass, Poison
{
	public Ivysaur()
	{
		super(002, "Ivysaur");
	}
	
	public Ivysaur(String name)
	{
		super(002, name);
		
	}

	public Ivysaur(int number, String name)
	{
		super(number, name);
	}
	
	public void spooky()
	{
		super.setHealth(getHealth() + 10);
	}
public int green(int power)
{
	return 76;
}
public int acid()
{
	return 65;
}
public int smog()
{
	return 54;
}
	}