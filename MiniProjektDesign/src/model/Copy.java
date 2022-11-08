package model;

public class Copy {
	private int serialNumber;
	private String purchaseDate;
	private double purchasePrice;
	public Copy(int serialNumber, String purchaseDate, double purchasePrice) {
		this.setSerialNumber(serialNumber);
		this.setPurchaseDate(purchaseDate);
		this.setPurchasePrice(purchasePrice);
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
}
