package poke.controller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import poke.model.monsters.Pokemon;
import poke.view.PokeFrame;
import javax.swing.JOptionPane;


public class IOController
{

	
	public static ArrayList<Pokemon> loadData(String dataFile, PokeFrame frame)
	{
		ArrayList<Pokemon> pokeList = null;
		return pokeList;
	}
	
	public static void saveData(String dataFile, ArrayList<Pokemon> pokemonList, PokeFrame frame)
	{
		
	}
}
