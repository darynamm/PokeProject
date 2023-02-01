package poke.controller;

import poke.model.*;
import poke.model.monsters.Bulbasaur;
import poke.model.monsters.Eevee;
import poke.model.monsters.Gengar;
import poke.model.monsters.Ivysaur;
import poke.model.monsters.Pokemon;
import poke.model.monsters.Sylveon;

import java.util.ArrayList;
import poke.view.PokeFrame;
import javax.swing.JOptionPane;

public class Controller
{

	private ArrayList<Pokemon> pokedex;
	private String dataFile;

	private PokeFrame window;

	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "save.pokemon";
		
		createPokedex();
		
		this.window = new PokeFrame(this);
	}

	public void start()
	{
ArrayList<Pokemon> saved = IOController.loadData(dataFile,  window);

if (saved != null && saved.size() > 0)
{
	this.pokedex = saved;
}
	}

	public void save()
	{
		IOController.saveData(dataFile, pokedex, window);
	}
	public boolean validateNumber(String text)
{
	boolean isValid = false;
	
	try
	{
		Integer.parseInt(text);
		isValid = true;
	}
	catch (NumberFormatException error)
	{
		JOptionPane.showMessageDialog(window,  "You need to type in a number");
	}
	return isValid;
}
	
	
	public void updateCurrentPokemon(String name, int index, int health, boolean evolve)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setHealth(health);
		current.setCanEvolve(evolve);
	}
	private void createPokedex()
	{
		this.pokedex.add(new Eevee());
		this.pokedex.add(new Eevee("Cute little cat pokemom"));

		pokedex.add(new Bulbasaur());
		pokedex.add(new Bulbasaur(001, "poisonous saur"));

		pokedex.add(new Gengar());
		pokedex.add(new Gengar(94, "ghostly poisonous creauture"));

		this.pokedex.add(new Sylveon());
		this.pokedex.add(new Sylveon("fairy pokemom"));

		pokedex.add(new Ivysaur());
		pokedex.add(new Ivysaur(002, "ivy tree pokemon"));
	}
}
