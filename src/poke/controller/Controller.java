package poke.controller;

import poke.model.*;
import java.util.ArrayList;
public class Controller
{
	
	private ArrayList<Pokemon> pokedex;
	private String dataFile;
	
	public Controller()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.dataFile = "";
	}
	
 public void start()
 {
	 
 }
 private void createPokedex()
 {
 this.pokedex.add(new Eevee());
 this.pokedex.add(new Eevee("Cute little cat pokemom"));
 
 pokedex.add(new Bulbasaur());
 pokedex.add(new Bulbasaur(001, "poisonous saurr"));
 
 
 pokedex.add(new Gengar());
 pokedex.add(new Gengar(94, "ghostly poisonous creauture"));
 
 
 this.pokedex.add(new Sylveon());
 this.pokedex.add(new Sylveon("fairy pokemom"));
 
 
 pokedex.add(new Ivysaur());
 pokedex.add(new Ivysaur(002, "ivy tree pokemon"));
 }
}
