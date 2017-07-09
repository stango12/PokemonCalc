package main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import data.elements.Type.TYPE;
import data.pokemon.*;

public class PokeTeamCalc extends JPanel
{
	final String PATH_NAME = "C:/Users/steve_000/workspace/PokemonCalculator/src/main";
	static int idx1;
	static int idx2;
	static int idx3;
	static int idx4;
	static int idx5;
	static int idx6;
	static Pokemon[] OU = {new Alakazam_Mega(), new Bisharp(), new Celesteela(), new Chansey(), new Charizard_MegaX(), new Charizard_MegaY(),
						   new Clefable(), new Dugtrio(), new Excadrill(), new Ferrothorn(), new Garchomp(), new Garchomp_Mega(),
						   new Gengar(), new Greninja(), new Greninja_Ash(), new Heatran(), new Heracross_Mega(), new Hoopa_Unbound(),
						   new Jirachi(), new Kartana(), new Kyurem_Black(), new Landorus_Therian(), new Latios(), new Magearna(),
						   new Magnezone(), new Manectric_Mega(), new Marowak_Alola(), new Mawile_Mega(), new Medicham_Mega(), new Mew(),
						   new Mimikyu(), new Nihilego(), new Pinsir_Mega(), new Rotom_Wash(), new Sableye_Mega(), new Scizor_Mega(),
						   new Scolipede(), new Skarmory(), new Smeargle(), new Tangrowth(), new Tapu_Bulu(), new Tapu_Fini(), new Tapu_Koko(),
						   new Tapu_Lele(), new Toxapex(), new Tyranitar(), new Tyranitar_Mega(), new Venusaur_Mega(), new Volcarona(),
						   new Zapdos(), new Zygarde()};

	//creating the gui
	public PokeTeamCalc()
	{
		super(new BorderLayout());	
		JPanel mainTop = new JPanel();
		mainTop.setLayout(new GridLayout(3, 4, 10, 20));
		String[] OUNames = new String[OU.length];
		JPanel weakPanel = new JPanel();
		JPanel midPanel = new JPanel();
		JPanel strongPanel = new JPanel();
		JPanel midPanelCenter = new JPanel();
		JPanel weakPanelCenter = new JPanel();
		JPanel strongPanelCenter = new JPanel();
		weakPanelCenter.setLayout(new BorderLayout());
		midPanelCenter.setLayout(new BorderLayout());
		strongPanelCenter.setLayout(new BorderLayout());
		weakPanel.setLayout(new FlowLayout());
		midPanel.setLayout(new FlowLayout());
		strongPanel.setLayout(new FlowLayout());
		
		JLabel bugPic = new JLabel(new ImageIcon(PATH_NAME + "/BugPic.png"));
		JLabel darkPic = new JLabel(new ImageIcon(PATH_NAME + "/DarkPic.png"));
		JLabel dragonPic = new JLabel(new ImageIcon(PATH_NAME + "/DragonPic.png"));
		JLabel electricPic = new JLabel(new ImageIcon(PATH_NAME + "/ElectricPic.png"));
		JLabel fairyPic = new JLabel(new ImageIcon(PATH_NAME + "/FairyPic.png"));
		JLabel fightingPic = new JLabel(new ImageIcon(PATH_NAME + "/FightingPic.png"));
		JLabel firePic = new JLabel(new ImageIcon(PATH_NAME + "/FirePic.png"));
		JLabel flyingPic = new JLabel(new ImageIcon(PATH_NAME + "/FlyingPic.png"));
		JLabel ghostPic = new JLabel(new ImageIcon(PATH_NAME + "/GhostPic.png"));
		JLabel grassPic = new JLabel(new ImageIcon(PATH_NAME + "/GrassPic.png"));
		JLabel groundPic = new JLabel(new ImageIcon(PATH_NAME + "/GroundPic.png"));
		JLabel icePic = new JLabel(new ImageIcon(PATH_NAME + "/IcePic.png"));
		JLabel normalPic = new JLabel(new ImageIcon(PATH_NAME + "/NormalPic.png"));
		JLabel poisonPic = new JLabel(new ImageIcon(PATH_NAME + "/PoisonPic.png"));
		JLabel psychicPic = new JLabel(new ImageIcon(PATH_NAME + "/PsychicPic.png"));
		JLabel rockPic = new JLabel(new ImageIcon(PATH_NAME + "/RockPic.png"));
		JLabel steelPic = new JLabel(new ImageIcon(PATH_NAME + "/SteelPic.png"));
		JLabel waterPic = new JLabel(new ImageIcon(PATH_NAME + "/WaterPic.png"));

		
		for(int i = 0; i < OU.length; i++)
			OUNames[i] = OU[i].getName();
		
		JLabel pokeImage1 = new JLabel();
		JComboBox<String> pokeList1 = new JComboBox<String>(OUNames);
		JLabel pokeImage2 = new JLabel();
		JComboBox<String> pokeList2 = new JComboBox<String>(OUNames);
		JLabel pokeImage3 = new JLabel();
		JComboBox<String> pokeList3 = new JComboBox<String>(OUNames);
		JLabel pokeImage4 = new JLabel();
		JComboBox<String> pokeList4 = new JComboBox<String>(OUNames);
		JLabel pokeImage5 = new JLabel();
		JComboBox<String> pokeList5 = new JComboBox<String>(OUNames);
		JLabel pokeImage6 = new JLabel();
		JComboBox<String> pokeList6 = new JComboBox<String>(OUNames);
		
		JLabel weak = new JLabel("You are weak against..."); //-5 and down
		JLabel neutral = new JLabel("You are okay against..."); // -4 to 4
		JLabel strong = new JLabel("You are great against..."); //5 and up
		
		mainTop.add(pokeList1);
		mainTop.add(pokeList2);
		mainTop.add(weak);
		mainTop.add(weakPanelCenter);
		mainTop.add(pokeList3);
		mainTop.add(pokeList4);
		mainTop.add(neutral);
		mainTop.add(midPanelCenter);
		mainTop.add(pokeList5);
		mainTop.add(pokeList6);
		mainTop.add(strong);
		mainTop.add(strongPanelCenter);
		
		add(mainTop, BorderLayout.CENTER);
		
		ActionListener actionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	idx1 = pokeList1.getSelectedIndex();
		    	idx2 = pokeList2.getSelectedIndex();
		    	idx3 = pokeList3.getSelectedIndex();
		    	idx4 = pokeList4.getSelectedIndex();
		    	idx5 = pokeList5.getSelectedIndex();
		    	idx6 = pokeList6.getSelectedIndex();
		    	
		    	/*
		        System.out.println("Selected " + idx1 + ": " + pokeList1.getSelectedItem());
		        System.out.println("Selected " + idx2 + ": " + pokeList2.getSelectedItem());
		        System.out.println("Selected " + idx3 + ": " + pokeList3.getSelectedItem());
		        System.out.println("Selected " + idx4 + ": " + pokeList4.getSelectedItem());
		        System.out.println("Selected " + idx5 + ": " + pokeList5.getSelectedItem());
		        System.out.println("Selected " + idx6 + ": " + pokeList6.getSelectedItem());
		        */
		    	
		    	Map<TYPE, Integer> teamScore = processPokemon();
		    	for(TYPE v : teamScore.keySet())
		    	{
		    		System.out.println(v + ": " + teamScore.get(v));
		    		switch(v)
		    		{
		    			case BUG:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(bugPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(bugPic);
		    				else
		    					midPanel.add(bugPic);
		    				break;
		    				
		    			case DARK:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(darkPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(darkPic);
		    				else
		    					midPanel.add(darkPic);
		    				break;
		    				
		    			case DRAGON:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(dragonPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(dragonPic);
		    				else
		    					midPanel.add(dragonPic);
		    				break;
		    				
		    			case ELECTRIC:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(electricPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(electricPic);
		    				else
		    					midPanel.add(electricPic);
		    				break;
		    				
		    			case FAIRY:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(fairyPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(fairyPic);
		    				else
		    					midPanel.add(fairyPic);
		    				break;
		    				
		    			case FIGHTING:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(fightingPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(fightingPic);
		    				else
		    					midPanel.add(fightingPic);
		    				break;
		    				
		    			case FIRE:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(firePic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(firePic);
		    				else
		    					midPanel.add(firePic);
		    				break;
		    				
		    			case FLYING:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(flyingPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(flyingPic);
		    				else
		    					midPanel.add(flyingPic);
		    				break;
		    				
		    			case GHOST:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(ghostPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(ghostPic);
		    				else
		    					midPanel.add(ghostPic);
		    				break;
		    				
		    			case GRASS:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(grassPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(grassPic);
		    				else
		    					midPanel.add(grassPic);
		    				break;
		    				
		    			case GROUND:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(groundPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(groundPic);
		    				else
		    					midPanel.add(groundPic);
		    				break;
		    				
		    			case ICE:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(icePic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(icePic);
		    				else
		    					midPanel.add(icePic);
		    				break;
		    				
		    			case NORMAL:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(normalPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(normalPic);
		    				else
		    					midPanel.add(normalPic);
		    				break;
		    				
		    			case POISON:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(poisonPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(poisonPic);
		    				else
		    					midPanel.add(poisonPic);
		    				break;
		    				
		    			case PSYCHIC:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(psychicPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(psychicPic);
		    				else
		    					midPanel.add(psychicPic);
		    				break;
		    				
		    			case ROCK:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(rockPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(rockPic);
		    				else
		    					midPanel.add(rockPic);
		    				break;
		    				
		    			case STEEL:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(steelPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(steelPic);
		    				else
		    					midPanel.add(steelPic);
		    				break;
		    				
		    			case WATER:
		    				if(teamScore.get(v) <= -5)
		    					weakPanel.add(waterPic);
		    				else if (teamScore.get(v) >= 5)
		    					strongPanel.add(waterPic);
		    				else
		    					midPanel.add(waterPic);
		    				break;
		    		}
		    		
		    		weakPanel.revalidate();
		    		strongPanel.revalidate();
		    		midPanel.revalidate();
		    		
		    		weakPanel.repaint();
		    		strongPanel.repaint();
		    		midPanel.repaint();
		  
		    		midPanelCenter.add(midPanel, BorderLayout.CENTER);
		    		midPanelCenter.revalidate();
		    		midPanelCenter.repaint();
		    		
		    		weakPanelCenter.add(weakPanel, BorderLayout.CENTER);
		    		weakPanelCenter.revalidate();
		    		weakPanelCenter.repaint();
		    		
		    		strongPanelCenter.add(strongPanel, BorderLayout.CENTER);
		    		strongPanelCenter.revalidate();
		    		strongPanelCenter.repaint();
		    	}
		      }

		    };
		    
		   	pokeList1.addActionListener(actionListener);
		   	pokeList2.addActionListener(actionListener);
		   	pokeList3.addActionListener(actionListener);
		   	pokeList4.addActionListener(actionListener);
		   	pokeList5.addActionListener(actionListener);
		   	pokeList6.addActionListener(actionListener);
	}
	
	//calling the gui
	private static void createAndShowGUI()
	{
        JFrame frame = new JFrame("ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new PokeTeamCalc();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
	
	public static void testPokemon()
	{
		Celesteela p = new Celesteela();
		System.out.println(p.getName());
		System.out.println(p.getWeaknesses());
		System.out.println(p.getNoEffectDef());
		System.out.println(p.getDefHalfEffect());
	}
	
	/* assign a score to each type
	 * x2 weakness = -2
	 * x4 weakness = -4
	 * no effect = +3
	 * 1/2 effect = +2
	 */
	public static Map<TYPE, Integer> processPokemon()
	{
		Map<TYPE, Integer> score = new HashMap<TYPE, Integer>();
		score.put(TYPE.BUG, 0);
		score.put(TYPE.DARK, 0);
		score.put(TYPE.DRAGON, 0);
		score.put(TYPE.ELECTRIC, 0);
		score.put(TYPE.FAIRY, 0);
		score.put(TYPE.FIGHTING, 0);
		score.put(TYPE.FIRE, 0);
		score.put(TYPE.FLYING, 0);
		score.put(TYPE.GHOST, 0);
		score.put(TYPE.GRASS, 0);
		score.put(TYPE.GROUND, 0);
		score.put(TYPE.ICE, 0);
		score.put(TYPE.NORMAL, 0);
		score.put(TYPE.POISON, 0);
		score.put(TYPE.PSYCHIC, 0);
		score.put(TYPE.ROCK, 0);
		score.put(TYPE.STEEL, 0);
		score.put(TYPE.WATER, 0);
		
		Pokemon[] p = {OU[idx1], OU[idx2], OU[idx3], OU[idx4], OU[idx5], OU[idx6]};
		
		for(int i = 0; i < p.length; i++)
		{
			ArrayList<TYPE> defWeak = p[i].getWeaknesses();
			for(int j = 0; j < defWeak.size(); j++)
			{
				Integer s = score.get(defWeak.get(j));
				s -= 2;
				score.put(defWeak.get(j), s);
			}
			
			ArrayList<TYPE> defNoEff = p[i].getNoEffectDef();
			for(int j = 0; j < defNoEff.size(); j++)
			{
				Integer s = score.get(defNoEff.get(j));
				s += 3;
				score.put(defNoEff.get(j), s);
			}
			
			ArrayList<TYPE> defStrong = p[i].getDefHalfEffect();
			for(int j = 0; j < defStrong.size(); j++)
			{
				Integer s = score.get(defStrong.get(j));
				s += 2;
				score.put(defStrong.get(j), s);
			}
		}
		
		return score;
	}
	
	public static void main(String[] args) 
	{
		//testPokemon();
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
}
