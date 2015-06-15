package manage.controle;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import manage.abstraction.FamilyGroup;


public class ControlJButtonAddPersonalInformation implements Observer, ActionListener {

	private FamilyGroup modele;
	private JButton button;
	private Frame parent;
	
	
	public ControlJButtonAddPersonalInformation(Frame parent, FamilyGroup modele, JButton button) {
		this.modele = modele;
		this.button = button;
		this.parent = parent;
		button.setEnabled(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			this.modele.addPersonalInformation();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(parent, "This person is not born!",
					"Error!", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	
	public void update(Observable obs, Object o) {
		
		
	}

}
