package poke.view;

import poke.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.Color;




public class PokeFrame extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel fieldPanel;
	private JTextField healhField;
	private JTextField nameField;
	private JTextField numberField;
	
	private JLabel healhField;
	private JLabel nameField;
	private JLabel numberField;
	
	
	private JCheckBox evolveBox;
	private JScrollPanel typesPanel;
	
	private JLabel imageLabel;
	
	private JComboBox<String>
	private PokePanel panel;
	
	
	public PokePanel(Controller app)
	{
		super();
		this.app = app;
	}
	
	public PokeFrame(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(1024,768);
		this.setResizable(false);
		this.setContentPanel(layout);
		this.setTitle("Inhertitance and pokemon");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}