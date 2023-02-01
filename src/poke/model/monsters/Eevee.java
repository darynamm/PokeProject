package poke.model.monsters;

import poke.model.types.Normal;

public class Eevee extends Pokemon implements Normal
{
public Eevee ()
{
	super(133, "Eevee");
	setup(250, true);
}
public Eevee(String name)
{
	super(133, name);
	
}

public Eevee(int number, String name)
{
	super(number, name);
}
public void norm()
{
	
}
}
