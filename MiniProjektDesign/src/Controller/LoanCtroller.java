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
import java.time.LocalDate; 
public class LoanCtroller {

	private Loan aloan;
	private Scanner scanner = new Scanner(System.in);
	private int loanNumber = 0;

	public LoanCtroller() {}
	
	public Loan createLoan(int period) {
		aloan = new Loan(period);
		aloan.setState(true);
		System.out.println("***   Loan created   ***");
		
		Person person = findPersonByPhone();
		aloan.setPerson(person);
		System.out.println("    - Account added -");
		
		Copy c = getCopy();
		aloan.setCopy(c);
		System.out.println("      - Copy added -");
		
		LoanContainer.getInstance().addLoan(aloan);
		System.out.println("***   Loan registered   ***");
		return aloan;
	}
	
	public Person findPersonByPhone() {
		System.out.println("  Enter your phone number");
		int phoneNr = getIntegerFromUser(scanner);
		PersonController pc = new PersonController();
		return pc.findByPhone(phoneNr);
	}
	
	public Copy getCopy() {
		System.out.println("  Enter the serial number   ");
		int serialNumber = getIntegerFromUser(scanner);
		LPController lpc = new LPController();
		return lpc.findCopy(serialNumber);
	}
	
	private int getIntegerFromUser(Scanner input) {
		while (!input.hasNextInt()) {
			System.out.println("Input can only contain numbers - try again");
			input.nextLine();
		}
		return input.nextInt();
	}
}
