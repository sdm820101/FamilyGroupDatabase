package manage.controle;

import java.util.Observable;
import java.util.Observer;
import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import manage.abstraction.FamilyGroup;
import manage.abstraction.PersonalInformation;


public class ControlJListPeople implements Observer, ListSelectionListener {
	private JList<String> list;
	private List<PersonalInformation> listOfPeople;
	private FamilyGroup modele;
	
	
	public ControlJListPeople(FamilyGroup fam, JList<String> l) {
		this.list = l;
		this.modele = fam;
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

	public JList<String> getList() {
		return list;
	}

	public void setList(JList<String> list) {
		this.list = list;
	}

	public List<PersonalInformation> getListOfPeople() {
		return listOfPeople;
	}

	public void setListOfPeople(List<PersonalInformation> listOfPeople) {
		this.listOfPeople = listOfPeople;
	}

	public FamilyGroup getModele() {
		return modele;
	}

	public void setModele(FamilyGroup modele) {
		this.modele = modele;
	}

}
