package tui;
import Controller.*;
import model.*;
import java.util.Scanner;

public class LoanMenu {

	public LoanMenu() {
		// initialise instance variables

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
