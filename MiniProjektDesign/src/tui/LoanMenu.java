package tui;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import Controller.*;
import model.*;
import java.util.Scanner;

public class LoanMenu {
	private LoanCtroller lc;
	private Person person;
	private Copy copy;
	private LP lp;
	private LPContainer lpc;
	public LoanMenu() {
		lc = new LoanCtroller();
		person = new Person("Philip", "Aalborg", "Sofiensdahlvej 123", 12345678, 9200);
		copy = new Copy(4312, "05/01/2022", 500);
		lp = new LP(99999, "Omega", "Oliver", "9.nov");		
		lp.addCopy(copy);
		lpc = LPContainer.getInstance();
		lpc.addLP(lp);
	}

	public void start() {
		loanMenu();
	}

	private void loanMenu() {
		boolean running = true;
		while (running) {
			int choice = writeLoanMenu();
			switch (choice) {
			case 1:
				createNewLoan();
				// System.out.println(" Denne er ikke implementeret endnu!");
				break;
			case 0:
				running = false;
				break;
			default:
				System.out.println("En uforklarlig fejl er sket med choice = " + choice);
				break;
			}
		}
	}

	private void createNewLoan() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a new Loan number:");
		int loanNr = scanner.nextInt();
		System.out.println("\nPlease enter the borrow date: ");
		String borrowDate = scanner.nextLine();
		System.out.println("\nPlease enter duration of the loan: ");
		String period = scanner.nextLine();
		System.out.println("\nPlease enter the return date: ");
		String returnDate = scanner.nextLine();
		System.out.println();
		lc.createLoan(loanNr, borrowDate, period, true, returnDate, person);
		
	}

	private int writeLoanMenu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("****** Udlånsmenu ******");
		System.out.println(" (1) Opret lån");
		System.out.println(" (0) Tilbage");
		System.out.print("\n Vælg:");
		int choice = getIntegerFromUser(keyboard);
		return choice;
	}

	private int getIntegerFromUser(Scanner keyboard) {
		while (!keyboard.hasNextInt()) {
			System.out.println("Input skal være et tal - prøv igen");
			keyboard.nextLine();
		}
		return keyboard.nextInt();
	}

}
