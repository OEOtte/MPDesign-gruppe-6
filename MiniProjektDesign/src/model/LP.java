package model;

public class LP {
	private int barcode;
	private String title;
	private String artist;
	private String publicationDate;
	public LP(int barcode, String title, String artist, String publicationDate) {
		this.setBarcode(barcode);
		this.setTitle(title);
		this.setArtist(artist);
		this.setPublicationDate(publicationDate);
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
}
