package manage.controle;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import manage.abstraction.FamilyGroup;
import manage.abstraction.Property;

public class ControlJListProperties implements Observer, ListSelectionListener {
	private JList<String> list;
	private List<Property> listOfProperties;
	private FamilyGroup modele;
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
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
	public FamilyGroup getModele() {
		return modele;
	}
	public void setModele(FamilyGroup modele) {
		this.modele = modele;
	}
	public List<Property> getListOfProperties() {
		return listOfProperties;
	}
	public void setListOfProperties(List<Property> listOfProperties) {
		this.listOfProperties = listOfProperties;
	}
	

}
