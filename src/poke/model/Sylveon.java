package poke.model;

public class Sylveon extends Pokemon implements Fairy
{

	public Sylveon()
	{
		super(700, "Sylveon");
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