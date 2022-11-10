package tui;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import Controller.*;
import model.*;

import org.junit.jupiter.api.Test;

class ControllTester {
	private Person person;
	private PersonContainer PC;
	private Copy copy;
	private LoanCtroller LC;
	private Loan aLoan;
	private LP lp;
	private LPContainer lpc;
	public ControllTester() {
		person = new Person("Philip", "Aalborg", "Sofiensdahlvej 123", 9200, 1);
		lp = new LP(99999, "Omega", "Oliver", "9.nov");
		copy = new Copy(1, "05/01/2022", 500);
		PC = PersonContainer.getInstance();
		lpc = LPContainer.getInstance();
		LC = new LoanCtroller();
		lp.addCopy(copy);
		lpc.addLP(lp);
		PC.addPerson(person);
		aLoan = LC.createLoan(14);
	}
	@Test
	void LoanPersonInfo() {
		assertFalse(null == aLoan.getPerson());
		
		assertTrue(person.getPostalCode() == aLoan.getPerson().getPostalCode());
		assertTrue(person.getCity() == aLoan.getPerson().getCity());
		assertTrue(person.getPhone() == aLoan.getPerson().getPhone());
		assertTrue(person.getName() == aLoan.getPerson().getName());
	}
	@Test
	void PersonContainer() {
		assertTrue(PC.getCurrentPeople().contains(person));
	}
	@Test
	void LoanCopyInfo() {
		assertTrue(aLoan.getCopy().getSerialNumber() == copy.getSerialNumber());
	}
	//@Test
	void CopyContainer() {
		assertTrue(lp.getCopies().contains(copy));
	}
	//@Test
	void LPInfo() {
		assertTrue(lp.getCopies().contains(aLoan.getCopy()));
	}
	//@Test
	void LPContainer() {
		assertTrue(lpc.getCurrentLPs().contains(lp));
	}
	//@Test
	void LoanInfo() {
		assertEquals(aLoan.getPerson().getName(), person.getName());
	}

}
