package Controller;

import java.util.ArrayList;

import model.Copy;
import model.Loan;
import model.LoanContainer;
import model.Person;

public class LoanCtroller {
	
	private Person p;
	private Loan aloan;

	public LoanCtroller() {};
	
	public void findPersonByPhone(int phone) {
		PersonController pc = new PersonController();
		p = pc.findByPhone(phone);

	}

	public Loan createLoan(int loanNumber, String borrowDate, String period, boolean state, String returnDate, Person person) {
		aloan = new Loan(loanNumber, borrowDate, period, state, returnDate);
		aloan.setPerson(person);
		
		// TODO mangler logik, for at henvende til getCopy metoden
		// getCopy(serialNumber);
		
		LoanContainer.getInstance().addLoan(aloan);
		return aloan;
	}
	
	private void getCopy(int serialNumber) {
		LPController lpc = new LPController();
		Copy copy = lpc.findCopy(serialNumber);
		aloan.setCopy(copy);
		//LoanContainer.getInstance().addLoan(aloan);
	}

}
