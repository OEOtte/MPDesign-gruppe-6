package Controller;

import java.util.ArrayList;

import model.Copy;
import model.Loan;
import model.LoanContainer;
import model.Person;

public class LoanCtroller {

	
	private Person p;
	private Loan l;

	public void findPersonByPhone(int phone) {
		PersonController pc = new PersonController();
		p = pc.findByPhone(phone);

	}

	public Loan createLoan(int loanNumber, String borrowDate, String period, boolean state, String returnDate) {
		l = new Loan(loanNumber, borrowDate, period, state, returnDate);
		l.setPerson(p);
		return l;

		
	}
	
	public void getCopy(int serialNumber) {
		LPController lpc = new LPController();
		Copy copy = lpc.findCopy(serialNumber);
		l.setCopy(copy);
		LoanContainer.getInstance().addLoan(l);
	}

}
