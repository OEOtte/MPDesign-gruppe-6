package tui;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.Scanner;

import Controller.LoanCtroller;
import model.*;
import Controller.*;


public class Tui {

	private LoanMenu loanMenu;
	/**
	 * Instanstiates a new <code>Tui</code> object
	 * 
	 * @param Construct a new Tui
	 */
	public Tui() {
		loanMenu = new LoanMenu();
	}
	/**
	 * This method starts the whole program
	 * 
	 * @param Call mainMenu method
	 */
	public void start() {
		mainMenu();
	}
	/**
	 * Starts a while loop that takes input from the user
	 * from where the user can call methods that will
	 * perform a given task given the input case
	 * 
	 * @param Start a while loop that will count as
	 * @param a start for the whole program
	 */
	private void mainMenu() {
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 2:
                  System.out.println("Denne er ikke implementeret endnu");
                  break;
                case 3:
                  loanMenu.start();
                  break;
                case 9:
                  writeData();
                  break;
                case 0:
                  System.out.println("Tak for denne gang.");
                  running = false;
                  break;
                default:
                  System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                  break;
            }
        }
    }
	private void writeData() {
		Person person = new Person("Philip", "Aalborg", "Sofiensdahlvej 123", 9200, 12345678);
		LP lp = new LP(99999, "Omega", "Oliver", "9.nov");
		Copy copy = new Copy(1234, "05/01/2022", 500);
		PersonContainer PC = PersonContainer.getInstance();
		LPContainer lpc = LPContainer.getInstance();
		lp.addCopy(copy);
		lpc.addLP(lp);
		PC.addPerson(person);
		System.out.println("***   User Data   ***");
		System.out.println("   Name: " + person.getName());
		System.out.println("   City: " + person.getCity());
		System.out.println("   Address: " + person.getAddress());
		System.out.println("   Postal Code: " + person.getPostalCode());
		System.out.println("   Phone Nr: " + person.getPhone());
		System.out.println();
		System.out.println("***   Copy Data   ***");
		System.out.println("   Serial Number: " + copy.getSerialNumber());
		System.out.println();
		System.out.println("***   LP Data   ***");
		System.out.println("   Artist: " + lp.getArtist());
		System.out.println("   Title: " + lp.getTitle());
		System.out.println("   Publication Date: " + lp.getPublicationDate());
		System.out.println("   Barcode: " + lp.getBarcode());
		System.out.println();
	}
	/**
	 * Setup a scanner that scans user inputs, and then return given input
	 * back into the mainMenu method
	 * 
	 * @param Setup interface & get user input
	 */
    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu");
        System.out.println(" (2) LP menu");
        System.out.println(" (3) Udlånsmenu");
        System.out.println(" (9) Generer testdata");// will generate testdata, delete in final version
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
	
}
