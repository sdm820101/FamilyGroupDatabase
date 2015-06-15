package manage.abstraction;

import java.util.Date;

public class Residence {
	private Date dateOfArrival;
	private Date dateOfLeaving;
	private PersonalInformation actualOwner;
	private Address address;
	
	public Residence(Date arrival, Date leaving, PersonalInformation perso, Address a) {
		this.dateOfArrival = arrival;
		this.dateOfLeaving = leaving;
		this.actualOwner = perso;
		this.address = a;
	}
	
	public Date getDateOfArrival() {
		return dateOfArrival;
	}
	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}
	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}
	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}
	public PersonalInformation getActualOwner() {
		return actualOwner;
	}
	public void setActualOwner(PersonalInformation actualOwner) {
		this.actualOwner = actualOwner;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
