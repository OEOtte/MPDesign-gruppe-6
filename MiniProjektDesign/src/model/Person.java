package model;

public class Person {
	private String name;
	private String address;
	private String city;
	private int postalCode;
	private int phone;
	public Person(String name, String address, String city, int postalCode, int phone) {
		this.setName(name);
		this.setAddress(address);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setPhone(phone);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
}