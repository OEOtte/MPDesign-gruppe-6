package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
public class Loan {
	private int loanNumber;
	private String borrowDate;
	private String period;
	private boolean state;
	private String returnDate;
	private Person person;
	private Copy copy;
	
	public Loan(int loanNumber, String borrowDate, String period, boolean state, String returnDate) {
		this.setLoanNumber(loanNumber);
		this.setBorrowDate(borrowDate);
		this.setPeriod(period);
		this.setState(state);
		this.setReturnDate(returnDate);
		person = null;
		copy = null;
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
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
