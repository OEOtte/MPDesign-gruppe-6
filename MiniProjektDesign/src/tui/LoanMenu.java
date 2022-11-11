package tui;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import Controller.*;
import model.*;
import java.util.Scanner;

public class LoanMenu {
	private LoanCtroller lc = new LoanCtroller();
	public LoanMenu() {}

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
		System.out.println("Please amount of days you want to loan for");
		int period = scanner.nextInt();
		System.out.println();
		Loan loan = lc.createLoan(period);
		printLoanInfo(loan);
	}

	private void printLoanInfo(Loan loan) {
		System.out.println();
		System.out.println("***   Loan Info   ***");
		System.out.println("   Loaner: " + loan.getPerson().getName());
		System.out.println("   Borrow Date: " + loan.getBorrowDate());
		System.out.println("   Return Date: " + loan.getReturnDate());
		System.out.println();
		System.out.println("***   Copy Info   ***");
		System.out.println("   Title: " + loan.getCopy().getLPofCopy().getTitle());
		System.out.println("   Artist: " + loan.getCopy().getLPofCopy().getArtist());
		System.out.println("   Barcode: " + loan.getCopy().getLPofCopy().getBarcode());
		System.out.println();
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
