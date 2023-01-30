package poke.model.monsters;

import poke.model.Pokemon;
import poke.model.types.Fairy;

public class Sylveon extends Pokemon implements Fairy
{

	public Sylveon()
	{
		super(700, "Sylveon");
		setup(250, true);
	}
	
	public Sylveon(String name)
	{
		super(700, name);
		
	}

	public Sylveon(int number, String name)
	{
		super(number, name);
	}
public int magic()
{
	return 34;
}
	}