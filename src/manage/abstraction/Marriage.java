package manage.abstraction;

import java.util.Date;

public class Marriage {
	private PersonalInformation spouseID1;
	private PersonalInformation spouseID2;
	private Date dateOfMarriage;
	private Place placeOfMarriage;
	
	public Marriage(PersonalInformation s1, PersonalInformation s2, Date d, Place p) {
		this.spouseID1 = s1;
		this.spouseID2 = s2;
		this.dateOfMarriage = d;
		this.placeOfMarriage = p;
	}
	
	public PersonalInformation getSpouseID1() {
		return spouseID1;
	}
	public void setSpouseID1(PersonalInformation spouseID1) {
		this.spouseID1 = spouseID1;
	}
	public PersonalInformation getSpouseID2() {
		return spouseID2;
	}
	public void setSpouseID2(PersonalInformation spouseID2) {
		this.spouseID2 = spouseID2;
	}
	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}
	public void setDateOfMarriage(Date dateOfMarriage) {
		this.dateOfMarriage = dateOfMarriage;
	}
	public Place getPlaceOfMarriage() {
		return placeOfMarriage;
	}
	public void setPlaceOfMarriage(Place placeOfMarriage) {
		this.placeOfMarriage = placeOfMarriage;
	}
}
