package manage.presentation;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import manage.controle.*;
import manage.abstraction.FamilyGroup;
import manage.abstraction.FamilyGroupJDBC;


public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	public static final int LABEL_SIZE = 18;
	
	private FamilyGroup modele;
	
	public MainWindow(FamilyGroup fam) {
		super("Manage Family Group");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.addWindowListener(new ControlJFrameMainWindow(fam));
		
		this.modele = fam;
		
		this.getContentPane().setLayout(new BorderLayout());
		
		this.createResearch();
		this.createCenter();
		this.createBottom();
		
		this.pack();
	}
	
	
	
	public void createResearch() {
		JPanel panelSearch = new JPanel(new BorderLayout());
		//panelSearch.setPreferredSize(new Dimension(50, 100));
		panelSearch.setBorder(BorderFactory.createEmptyBorder(6, 6, 3, 3));
		
		JLabel labelSearch = new JLabel("       Search ID");
		labelSearch.setFont(new Font(labelSearch.getFont().getName(), Font.BOLD, LABEL_SIZE));
		panelSearch.add(labelSearch, BorderLayout.NORTH);
		
		
		JTextField searchArea = new JTextField("");
		searchArea.setPreferredSize(new Dimension(100, 32));
		searchArea.setToolTipText("Enter an ID");
		panelSearch.add(searchArea, BorderLayout.CENTER);
		
		
		JButton launchSearch = new JButton((new ImageIcon(this.getClass().getClassLoader().getResource("search.gif"))));
		launchSearch.setPreferredSize(new Dimension(32, 32));
		launchSearch.setToolTipText("Search ID");
		ControlJButtonSearchID controlSearchID = new ControlJButtonSearchID(this.modele, searchArea);
		launchSearch.addActionListener(controlSearchID);
		panelSearch.add(launchSearch, BorderLayout.EAST);
		
		JButton changeView = new JButton((new ImageIcon(this.getClass().getClassLoader().getResource("fleche.gif"))));
		changeView.setPreferredSize(new Dimension(32, 32));
		changeView.setToolTipText("Change view to property");
		ControlJButtonChangeView controlChangeView = new ControlJButtonChangeView(this.modele, this);
		changeView.addActionListener(controlChangeView);
		panelSearch.add(changeView, BorderLayout.WEST);
		
		this.getContentPane().add(panelSearch, BorderLayout.NORTH);
		
	}
	
	public void createCenter() {
		JPanel panelListOfPeople = new JPanel(new BorderLayout());
		panelListOfPeople.setPreferredSize(new Dimension(400, 400));
		panelListOfPeople.setBorder(BorderFactory.createEmptyBorder(3, 6, 6, 6));

	   
		JLabel labelPeople = new JLabel("List of people");
		labelPeople.setFont(new Font(labelPeople.getFont().getName(), Font.BOLD, LABEL_SIZE));
		panelListOfPeople.add(labelPeople, BorderLayout.NORTH);
		
		
		JList<String> listeOfPeople = new JList<String>();
		listeOfPeople.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ControlJListPeople controleListePeople = new ControlJListPeople(
				this.modele, listeOfPeople);
		listeOfPeople.addListSelectionListener(controleListePeople);
		this.modele.addObserver(controleListePeople);
		panelListOfPeople.add(new JScrollPane(listeOfPeople), BorderLayout.CENTER);

		
		JButton addFamilyMember = new JButton(new ImageIcon(this.getClass().getClassLoader().getResource("family.gif")));
		addFamilyMember.setToolTipText("Add a new family relation to this person");
		ControlJButtonAddFamilyMember controlAddFamilyMember = new ControlJButtonAddFamilyMember(this.modele, this);
		
		this.getContentPane().add(panelListOfPeople, BorderLayout.CENTER);
	}
	
	public void createBottom() {
		JPanel panelResearch = new JPanel(new BorderLayout());
		panelResearch.setPreferredSize(new Dimension(400, 400));
	}
	
}
