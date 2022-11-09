package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.ArrayList;

public class LoanContainer {
	private static LoanContainer instance;
	private ArrayList<Loan> loans;

	public static LoanContainer getInstance() {
		if(instance == null) {
			instance = new LoanContainer();
		}
		return instance;
	}
	private LoanContainer() {
		loans = new ArrayList<>();
	}
	public void addLoan(Loan loan) {
		loans.add(loan);//TODO check correct input - null and duplicates
	}

	public ArrayList<Loan> getCurrentLoans() {
		return loans;
	}
}
