package model;
import java.util.ArrayList;

public class LP {
	private int barcode;
	private String title;
	private String artist;
	private String publicationDate;
	private ArrayList<Copy> copies;
	// Add array/container for hver copy der findes
	public LP(int barcode, String title, String artist, String publicationDate) {
		this.setBarcode(barcode);
		this.setTitle(title);
		this.setArtist(artist);
		this.setPublicationDate(publicationDate);
		this.setCopies(new ArrayList<>());
	}
	public int getBarcode() {
		return barcode;
	}
	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public void addCopy(Copy copy) {
		getCopies().add(copy);
	}
	public ArrayList<Copy> getCopies() {
		return copies;
	}
	public void setCopies(ArrayList<Copy> copies) {
		this.copies = copies;
	}
	public Copy getCopyBySN(int serialNumber) {
		Copy copy = null;
		for (int i = 0; i < copies.size() && copy == null; i++) {
			if(copies.get(i).getSerialNumber() == serialNumber) {
				copy = copies.get(i);
			}
		}
		return copy;
	}
}
