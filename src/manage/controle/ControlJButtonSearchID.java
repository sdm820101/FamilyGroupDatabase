package manage.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

import manage.abstraction.FamilyGroup;

public class ControlJButtonSearchID implements Observer, ActionListener {
	private FamilyGroup modele;
	private JTextField searchField;
	
	public ControlJButtonSearchID(FamilyGroup m, JTextField s) {
		this.setModele(m);
		this.setSearchField(s);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	public FamilyGroup getModele() {
		return modele;
	}
	public void setModele(FamilyGroup modele) {
		this.modele = modele;
	}
	public JTextField getSearchField() {
		return searchField;
	}
	public void setSearchField(JTextField searchField) {
		this.searchField = searchField;
	}

}
