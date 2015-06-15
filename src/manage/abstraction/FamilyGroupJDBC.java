package manage.abstraction;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class FamilyGroupJDBC extends FamilyGroup {

	protected Statement s;
	
	public FamilyGroupJDBC () {
		DBFamilyGroup.connexionBD();
		try {
			s = DBFamilyGroup.getConnexion().createStatement();
			// TODO: using s to give out the SQL
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void addPersonalInformation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFamilyMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewWork() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNewResidence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PersonalInformation> findEverybody() {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() {
		try {
			DBFamilyGroup.arretBD();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
