package manage.abstraction;

import java.util.List;
import java.util.Observable;

public abstract class FamilyGroup extends Observable {
	protected List<PersonalInformation> listOfPeople;
	protected List<Property> listOfProperties;
	
	public FamilyGroup() {
		super();
		this.listOfPeople = null;
		this.listOfProperties = null;
	}
	
	public abstract void addPersonalInformation();
	
	public abstract void addFamilyMember();
	
	public abstract void addNewWork();
	
	public abstract void addNewResidence();
	
	public abstract List<PersonalInformation> findEverybody();

	public abstract void close();
}
