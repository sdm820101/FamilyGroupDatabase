package manage.abstraction;

public class Address {
	private String streetName;
	private int number;
	private String county;
	private String village;
	private String district;
	private String postalCode;
	private String state;
	private Place cityAndCountry;
	
	public Address(String streetName, int number, String village, String postalCode, 
			String district, String county, String state, Place cityAndCountry) {
		this.streetName = streetName;
		this.number = number;
		this.county = county;
		this.village = village;
		this.district = district;
		this.postalCode = postalCode;
		this.state = state;
		this.cityAndCountry = cityAndCountry;
	}
	
	public Address() {
		this.streetName = null;
		this.number = 0;
		this.county = null;
		this.village = null;
		this.district = null;
		this.postalCode = null;
		this.state = null;
		this.cityAndCountry = null;
	}
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Place getCityAndCountry() {
		return cityAndCountry;
	}
	public void setCityAndCountry(Place cityAndCountry) {
		this.cityAndCountry = cityAndCountry;
	}
	
}
