package poke.view;

import javax.swing.JFrame;
import poke.controller.Controller;

public class PokeFrame extends JFrame
{
	private Controller app;
	private PokePanel panel;
	
	public PokeFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new PokePanel(this.app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1024,768);
		this.setResizable(false);
		this.setContentPane(panel);
		this.setTitle("Inheritance and Pokemon");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
	}
}