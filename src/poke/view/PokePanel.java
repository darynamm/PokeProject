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
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;



public class PokePanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel fieldPanel;
	private JTextField healthField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea typesArea;
	
	private JLabel healthLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	
	
	private JCheckBox evolveBox;
	private JScrollPane typesPane;
	
	private JLabel imageLabel;
	private ImageIcon icon;
	
	private JComboBox<String> pokedexSelector;
	
	private JButton updateButton;
	private JButton saveButton;
	
	public PokePanel(Controller app)
	{
		super();
		this.app = app;
		this.layout = new SpringLayout();
		
		this.fieldPanel = new JPanel(new GridLayout(0,2));
		
		this.healthField = new JTextField("health");
		this.nameField = new JTextField("name");
		this.numberField = new JTextField("Pokedex number:");
		
		this.healthLabel = new JLabel("health");
		this.nameLabel = new JLabel("name");
		this.numberLabel = new JLabel("Pokedex number:");	
		
		this.evolveBox = new JCheckBox("Pokemon can evolve", false);
		
		this.typesArea = new JTextArea(20,20);
		this.typesPane = new JScrollPane();
		this.imageLabel = new JLabel("image");
		this.icon = new ImageIcon();
		this.pokedexSelector = new JComboBox<String>();
		this.updateButton = new JButton("Update pokemon stats!");
		this.saveButton = new JButton("save the data");
		setupPanel();
		setupListeners();
		setupLayout();
				
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
		
		this.fieldPanel.add(healthLabel);
		this.fieldPanel.add(healthField);
		
		this.fieldPanel.add(nameLabel);
		this.fieldPanel.add(nameField);
		
		this.fieldPanel.add(numberLabel);
		this.fieldPanel.add(numberField);
		
		this.fieldPanel.add(updateButton);
		
		this.fieldPanel.add(evolveBox);
		this.fieldPanel.add(typesPane);
		fieldPanel.add(saveButton);
		
		this.add(fieldPanel);
		this.add(imageLabel);
		this.add(pokedexSelector);
		
	}
	
	private void collectInput()
	{
		String name = nameField.getText();
		String health = healthField.getText();
		boolean canEvolve = evolveBox.isSelected();
		int index = pokedexSelector.getSelectedIndex();
		
		if (app.validateNumber(health))
		{
			int healthValue = Integer.parseInt(health);
			app.updateCurrentPokemon(name, index, healthValue, canEvolve);
		}
	}
	private void setupListeners()
	{
		updateButton.addActionListener(click -> collectInput());
		saveButton.addActionListener(click -> app.save());
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST,  fieldPanel,  -250,  SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST,  fieldPanel, -25, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH,  fieldPanel, -25, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH,  fieldPanel, -25, SpringLayout.SOUTH, this);
		
		layout.putConstraint(SpringLayout.NORTH, imageLabel, 150, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, imageLabel, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, imageLabel, 150, SpringLayout.WEST, fieldPanel);
		
		layout.putConstraint(SpringLayout.WEST, pokedexSelector, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, pokedexSelector, -150, SpringLayout.WEST, fieldPanel);
		layout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -200, SpringLayout.SOUTH, this);
		
	}
	
	
	
}