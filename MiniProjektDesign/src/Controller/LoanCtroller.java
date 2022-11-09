package Controller;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.Scanner;

import model.Copy;
import model.Loan;
import model.LoanContainer;
import model.Person;

public class LoanCtroller {

	private Loan aloan;

	public LoanCtroller() {
	};

	// Metode til at finde en "friend" ved hjælp af phone.
	public Person findPersonByPhone(int phone) {
		PersonController pc = new PersonController();
		return pc.findByPhone(phone);

	}

	//Method for creating a loan with use of Person and Copy.
	public Loan createLoan(int loanNumber, String borrowDate, String period, boolean state, 
			String returnDate, Person person) {
		aloan = new Loan(loanNumber, borrowDate, period, state, returnDate);
		aloan.setPerson(person);

		// TODO mangler logik, for at henvende til getCopy metoden
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter serial number:");
		String input = scanner.nextLine().toLowerCase();
		int serialNumber = (int)Integer.parseInt(input);
		Copy c = getCopy(serialNumber);
		aloan.setCopy(c);
		LoanContainer.getInstance().addLoan(aloan);
		return aloan;
	}
	//Method used to stick our copy to "aloan".
	public Copy getCopy(int serialNumber) {
		LPController lpc = new LPController();
		return lpc.findCopy(serialNumber);
		// LoanContainer.getInstance().addLoan(aloan);
	}

}
