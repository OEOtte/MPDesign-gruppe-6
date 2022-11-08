package tui;

import static org.junit.jupiter.api.Assertions.*;
import Controller.*;
import model.*;

import org.junit.jupiter.api.Test;

class ControllTester {
	private Person person;
	private Copy copy;
	private LoanCtroller LC;
	private Loan aLoan;
	
	@Test
	void test() {
		person = new Person("Philip", "Aalborg", "Sofiensdahlvej 123", 12345678, 9200);
		copy = new Copy(4312, "05/01/2022", 500);
		LC = new LoanCtroller();
		
		aLoan = LC.createLoan(123, "08/11/2022", "3 weeks", true, "29/11/2022", person);
		
		assertTrue(aLoan.getPerson() == person);
		
		// TODO tilføj logikken til at dette retunerer true
		assertTrue(aLoan.getCopy() == copy);
	}

}
