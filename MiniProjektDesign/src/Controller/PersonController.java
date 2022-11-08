package Controller;

import model.Person;
import model.PersonContainer;

public class PersonController {

	public Person createPerson(String name, int phone, String address, String city, int postalCode) {
		Person p = new Person(name, city, address, phone, postalCode);
		PersonContainer.getInstance().addPerson(p);
		return p;
	}
	
	public Person findByPhone(int phone) {
		PersonContainer pc = PersonContainer.getInstance();
		Person p = pc.findByPhone(phone);
		return p;
	}
}