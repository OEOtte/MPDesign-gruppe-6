package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Copy;
import model.Loan;
import model.LoanContainer;
import model.Person;

public class LoanCtroller {

	private Person p;
	private Loan aloan;

	public LoanCtroller() {
	};

	// Metode til at finde en "friend" ved hjælp af phone.
	public void findPersonByPhone(int phone) {
		PersonController pc = new PersonController();
		p = pc.findByPhone(phone);

	}

	//Method for creating a loan with use of Person and Copy.
	public Loan createLoan(int loanNumber, String borrowDate, String period, boolean state, 
			String returnDate, Person person) {
		aloan = new Loan(loanNumber, borrowDate, period, state, returnDate);
		aloan.setPerson(person);

		// TODO mangler logik, for at henvende til getCopy metoden
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toLowerCase();
		int serialNumber = Integer.parseInt(input);
		getCopy(serialNumber);

		LoanContainer.getInstance().addLoan(aloan);
		return aloan;
	}
	//Method used to stick our copy to "aloan".
	private void getCopy(int serialNumber) {
		LPController lpc = new LPController();
		Copy copy = lpc.findCopy(serialNumber);
		aloan.setCopy(copy);
		// LoanContainer.getInstance().addLoan(aloan);
	}

}
