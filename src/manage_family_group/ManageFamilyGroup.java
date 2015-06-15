package manage_family_group;


import manage.abstraction.*;
import manage.controle.*;
import manage.presentation.*;

public class ManageFamilyGroup {
	public static void main(String[] args) {
		FamilyGroup famGroup = new FamilyGroupJDBC();
		
		MainWindow fen = new MainWindow(famGroup);
		fen.setVisible(true);
	}

}
