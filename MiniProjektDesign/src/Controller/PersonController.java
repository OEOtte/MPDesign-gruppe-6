package Controller;

import model.Person;
import model.PersonContainer;

public class PersonController {

	public Person createPerson(String name, int phone, String Address, String City, int postalCode) {
		Person p = new Person(name, phone, address, city, postalCode);
		PersonContainer.getInstance().addPerson(p);
		return p;
	}
	
	public Person findByPhone(int phone) {
		PersonContainer pc = PersonContainer.getInstance();
		Person p = pc.findByPhone(phone);
		
	}
}
