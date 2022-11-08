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
	public Person findByPhone(int phone) {
		// TODO Auto-generated method stub
		return null;
	}
}