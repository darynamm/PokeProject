package poke.view;
import javax.swing.JLabel;
import poke.controller.Controller;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;

import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.Color;




public class PokePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel fieldPanel;
	private JTextField healhField;
	private JTextField nameField;
	private JTextField numberField;
	
	private JLabel healhLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	
	
	private JCheckBox evolveBox;
	private JScrollPane typesPanel;
	
	private JLabel imageLabel;
	
	private JComboBox<String>
	private PokePanel panel;
	
	
	public PokePanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		
		this.fieldPanel = new JPanel(new GridLayout(0,1));
		
		this.healthField = new JTextField("health");
		this.nameField = new JTextField("name");
		this.numberField = new JLabel("Pokedex number:");
		
		this.healthLabel = new JLabel("health");
		this.nameLabel = new JLabel("name");
		this.numberLabel = new JLabel("Pokedex number:");	
		
		this.evolveBox = new JCheckBox("Pokemon can evolve", false);
		
		this.typesArea = new JTextArea(20,20);
		this.typesPanel = new JScrollPane();
		this.imageLabel = new JLabel("image");
		this.pokedexSelector = new JComboBox<String>();
		
		setupPanel();
		setupListeners();
		setupLayout();
				
	}
	
	public PokeFrame(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		setupFrame();
	}
	private void setupPanel()
	{
		this.setLayout(layout);;
		this.setBackground(Color.CYAN);
		this.setPreferredSize(new Dimension(1024, 768));
		
		this.numberField.setEnabled(false);
		this.typesArea.setEnabled(false);
		this.typesPane.setViewportView(typesArea);
		this.typesPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.typesPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		this.fieldPanel.add(healthField);
		this.fieldPanel.add(nameField);
		
		this.fieldPanel.add(numberField);
		this.fieldPanel.add(evolveBox);
		
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
		
	}
	private void setupListeners()
	{
		
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