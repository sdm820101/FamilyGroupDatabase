package manage.abstraction;

import java.sql.Date;

public class Property {
	private int propertyID;
	private PropertyType type;
	private Address address;
	private String description;
	private int price;
	private Date timeOfPurchase;
	private Date timeOfManufacture;
	
	public Property(int propID, PropertyType t, Address a, String d, int price, Date purchasing, Date manufacturing){
		this.propertyID = propID;
		this.type = t;
		this.address = a;
		this.description = d;
		this.price = price;
		this.timeOfPurchase = purchasing;
		this.timeOfManufacture = manufacturing;
	}
	
	public int getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	public PropertyType getType() {
		return type;
	}
	public void setType(PropertyType type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getTimeOfPurchase() {
		return timeOfPurchase;
	}
	public void setTimeOfPurchase(Date timeOfPurchase) {
		this.timeOfPurchase = timeOfPurchase;
	}
	public Date getTimeOfManufacture() {
		return timeOfManufacture;
	}
	public void setTimeOfManufacture(Date timeOfManufacture) {
		this.timeOfManufacture = timeOfManufacture;
	}
}
