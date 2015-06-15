package manage.abstraction;

import java.util.List;
import java.util.Date;

public class PersonalInformation {
	private int personalID;
	private String name;
	private Gender gender;
	private Place placeOfBirth;
	private Date birthdate;
	private boolean isMarried;
	private int idNumber;
	private List<FamilyRelations> family;
	private List<Residence> residences;
	private List<Work> jobs;
	private List<Property> properties;
	
	public PersonalInformation(int pID, String name, Gender g, Place p, Date d, int idNum) {
		this.personalID = pID;
		this.name = name;
		this.gender = g;
		this.placeOfBirth = p;
		this.birthdate = d;
		this.idNumber = idNum;
		this.isMarried = false;
		this.family = null;
		this.residences = null;
		this.jobs = null;
		this.properties = null;
	}
	
	public int getPersonalID() {
		return personalID;
	}
	public void setPersonalID(int personalID) {
		this.personalID = personalID;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public List<FamilyRelations> getFamily() {
		return family;
	}
	public void setFamily(List<FamilyRelations> family) {
		this.family = family;
	}
	public List<Residence> getResidences() {
		return residences;
	}
	public void setResidences(List<Residence> residences) {
		this.residences = residences;
	}
	public List<Work> getJobs() {
		return jobs;
	}
	public void setJobs(List<Work> jobs) {
		this.jobs = jobs;
	}
	public List<Property> getProperties() {
		return properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	public Place getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(Place placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
