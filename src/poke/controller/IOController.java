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
		
		try (FileInputStream fileStream = new FileInputStream(dataFile);
				ObjectInputStream objctStream = new ObjectInputStream(fileStream)
		{
			ArrayList<Pokemon> loadedPokemon = new ArrayList,Pokemon>();
			loadedPokemon = (ArrayList<Pokemon>) objectStream.readObject();
			pokeList = loadedPokemon;
		}
		catch(IOException fileReadEror)
		
		{
			JOptionPane.showMessageDialog(frame,  fileReadError.getMessage(), "Could not read the file!!", JOptionPane.ERROR_MESSAGE);
		}
		catch (ClassNotFoundException classError)
		{
			JOptionPane.showMessageDialog(frame,  classError.getMessage(), "OMG class error!", JOptionPane.ERROR_MESSAGE);
		}
		return pokeList;
	}
	
	public static void saveData(String dataFile, ArrayList<Pokemon> pokemonList, PokeFrame frame)
	{
		
		try (FileOutputStream fileStream = new FileOutputStream(dataFile);
				ObjectOutputStream objectStream = new ObjectOutputStream(fileStream))
		{
			objectStream.writeObject(pokemonList);
		}
		catch (IOException fileError)
		{
			JOptionPane.showMessageDialog(frame, "Error saving file!");
		}
		
		
	}
}
