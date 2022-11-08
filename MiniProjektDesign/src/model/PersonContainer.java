package model;

import java.util.ArrayList;

public class PersonContainer {
	private static PersonContainer instance;
	private ArrayList<Person> people;

	public static PersonContainer getInstance() {
		if(instance == null) {
			instance = new PersonContainer();
		}
		return instance;
	}
	private PersonContainer() {
		people = new ArrayList<>();
	}
	public void addPerson(Person person) {
		people.add(person);//TODO check correct input - null and duplicates
	}

	public ArrayList<Person> getCurrentPeople() {
		return people;
	}
	
	/** 
	 * @param Find person using phone
	 * Here we search through every person in our list
	 * to find a person with a phone matching our phone input
	 * @return
	 */
	public Person findByPhone(int phone) {
		Person res = null;
		boolean found = false;
		for (int i = 0; i < people.size() && !found; i++) {
			if (people.get(i).getPhone() == phone) {
				res = people.get(i);
				found = true;
			}
		}
		return res;
	}
}