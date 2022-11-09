package tui;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import static org.junit.jupiter.api.Assertions.*;
import Controller.*;
import model.*;

import org.junit.jupiter.api.Test;

class ControllTester {
	private Person person;
	private Copy copy;
	private LoanCtroller LC;
	private Loan aLoan;
	private LP lp;
	private LPContainer lpc;
	
	@Test
	void test() {
		person = new Person("Philip", "Aalborg", "Sofiensdahlvej 123", 12345678, 9200);
		lp = new LP(99999, "Omega", "Oliver", "9.nov");
		copy = new Copy(4312, "05/01/2022", 500);
		lp.addCopy(copy);
		LC = new LoanCtroller();
		lpc = LPContainer.getInstance();
		lpc.addLP(lp);
		
		aLoan = LC.createLoan(123, "08/11/2022", "3 weeks", true, "29/11/2022", person);
		
		assertTrue(aLoan.getPerson() == person);
		
		assertTrue(aLoan.getCopy() == copy);
	}

}
