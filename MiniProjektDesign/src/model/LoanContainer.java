package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.ArrayList;

public class LoanContainer {
	private static LoanContainer instance;
	private ArrayList<Loan> loans;
	private int num = 0;

	public static LoanContainer getInstance() {
		if(instance == null) {
			instance = new LoanContainer();
		}
		return instance;
	}
	private LoanContainer() {
		loans = new ArrayList<>();
	}
	// Checker om input er null og om der allerede eksitere en loan med samme info
	public void addLoan(Loan loan) {
		if (loan == null) {
			System.out.println("Can't add null as a loan");
			return;
		}
		if (loans.size() == 0) {
			num++;
			setLoanNumber(loan);
			loans.add(loan);
			return;
		}
		if (checkForDuplicates(loan)) return;
		
		if (loan != loans.get(loans.size()-1)) {
			num++;
			setLoanNumber(loan);
			loans.add(loan);
		}
	}
	
	public boolean checkForDuplicates(Loan loan) {
		boolean duplicate = false;
		for (int i = 0; i < loans.size() && !duplicate; i++) {
			if (loan == loans.get(i)) {
				System.out.println("Can't add the same loan duplicates");
				duplicate = true;
			}
		}
		return duplicate;
	}
	
	public void setLoanNumber(Loan loan) {
		loan.setLoanNumber(num);
	}
	public ArrayList<Loan> getCurrentLoans() {
		return loans;
	}
}
