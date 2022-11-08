package model;

public class Copy {
	private int serialNumber;
	private String purchaseDate;
	private String purchasePrice;
	public Copy(int serialNumber, String purchaseDate, String purchasePrice) {
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
	public String getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
}
