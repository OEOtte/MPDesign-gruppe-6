package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
public class Person {
	private String name;
	private String address;
	private String city;
	private int postalCode;
	private int phone;
	/**
	 * Constructs a new <code>Person</code> object
	 * 
	 * @param Create new person
	 */
	public Person(String name, String address, String city, int postalCode, int phone) {
		this.setName(name);
		this.setAddress(address);
		this.setCity(city);
		this.setPostalCode(postalCode);
		this.setPhone(phone);
	}
	/**
	 * Returns the name of <code>Person</code>
	 * 
	 * @param get name of <code>Person</code>
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets the name of <code>Person</code>
	 * 
	 * @param set name of <code>Person</code>
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Returns the address of <code>Person</code>
	 * 
	 * @param get address of <code>Person</code>
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * sets the address of <code>Person</code>
	 * 
	 * @param set address of <code>Person</code>
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Returns the city of <code>Person</code>
	 * 
	 * @param get city of <code>Person</code>
	 */
	public String getCity() {
		return city;
	}
	/**
	 * sets the city of <code>Person</code>
	 * 
	 * @param set city of <code>Person</code>
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * Returns the postal code of <code>Person</code>
	 * 
	 * @param get postal code of <code>Person</code>
	 */
	public int getPostalCode() {
		return postalCode;
	}
	/**
	 * sets the postal code of <code>Person</code>
	 * 
	 * @param set postal code of <code>Person</code>
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * Returns the phone of <code>Person</code>
	 * 
	 * @param get phone of <code>Person</code>
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * sets the phone of <code>Person</code>
	 * 
	 * @param set phone of <code>Person</code>
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
}