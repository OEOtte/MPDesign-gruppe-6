package model;

public class Loan {
	private int loanNumber;
	private String borrowDate;
	private String period;
	private boolean state;
	private String returnDate;
	public Loan(int loanNumber, String borrowDate, String period, boolean state, String returnDate) {
		this.setLoanNumber(loanNumber);
		this.setBorrowDate(borrowDate);
		this.setPeriod(period);
		this.setState(state);
		this.setReturnDate(returnDate);
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
	
}
