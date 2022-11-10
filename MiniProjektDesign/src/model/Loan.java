package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.time.LocalDate;
public class Loan {
	private int loanNumber;
	private LocalDate borrowDate;
	private int period;
	private boolean state;
	private LocalDate returnDate;
	private Person person;
	private Copy copy;
	
	public Loan(int period) {
		this.setPeriod(period);
		borrowDate = LocalDate.now();
		returnDate = borrowDate.plusDays(period);
		person = null;
		copy = null;
		state = false;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getBorrowDate() {
		String res = "" + borrowDate;
		return res;
	}
	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Copy getCopy() {
		return copy;
	}
	public void setCopy(Copy copy) {
		this.copy = copy;
	}
	
}
