package poke.model;

public class Gengar extends Pokemon implements Ghost
{
	public Gengar()
	{
		super(94, "Ivysaur");
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