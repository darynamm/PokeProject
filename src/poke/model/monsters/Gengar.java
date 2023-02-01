package poke.model.monsters;

import poke.model.types.Ghost;

public class Gengar extends Pokemon implements Ghost
{
	public Gengar()
	{
		super(94, "Ivysaur");
		setup(250, true);
	}
	
	public Gengar(String name)
	{
		super(94, name);
		
	}

	public Gengar(int number, String name)
	{
		super(number, name);
	}
	
	public void spooky()
	{
		
	}
	public int smog()
	{
		return 34;
	}

	}