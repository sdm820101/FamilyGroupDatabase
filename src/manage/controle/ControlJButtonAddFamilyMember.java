package manage.controle;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import manage.abstraction.FamilyGroup;

public class ControlJButtonAddFamilyMember implements Observer, ActionListener {
	private FamilyGroup modele;
	private Frame parent;
	
	public ControlJButtonAddFamilyMember(FamilyGroup fam, Frame p) {
		this.setModele(fam);
		this.setParent(p);
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
	public Frame getParent() {
		return parent;
	}
	public void setParent(Frame parent) {
		this.parent = parent;
	}

}
