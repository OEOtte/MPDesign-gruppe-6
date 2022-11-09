package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.ArrayList;

public class PersonContainer {
	private static PersonContainer instance;
	private ArrayList<Person> people;

	/**
	 * returns an instance of <code>PersonContainer</code>
	 * 
	 * @param get instance of <code>PersonContainer</code>
	 */
	public static PersonContainer getInstance() {
		if(instance == null) {
			instance = new PersonContainer();
		}
		return instance;
	}
	/**
	 * Constructs a new <code>PersonContainer</code> object
	 * and instanstiate new arraylist
	 * 
	 * @param Call tui's start function
	 */
	private PersonContainer() {
		people = new ArrayList<>();
	}
	/**
	 * Adds a person into the <code>PersonContainer</code>
	 * 
	 * @param Add person into container
	 */
	public void addPerson(Person person) {
		people.add(person);//TODO check correct input - null and duplicates
	}

	/**
	 * returns a list of every person in the <code>PersonContainer</code>
	 * 
	 * @param get list of people in <code>PersonContainer</code>
	 */
	public ArrayList<Person> getCurrentPeople() {
		return people;
	}
	
	/**
	 * Here we search through every person in our <code>PersonContainer</code>
	 * to find a person with a phone matching our input
	 * 
	 * @param Find person using phone
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