package ca.sheridancollege.muthukur.beans;

public class Fiction {
	private Long ID;
	private String title;
	private String author;
	private Double price;
	private String genre;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Fiction [ID=" + ID + ", title=" + title + ", author=" + author + ", price=" + price + ", genre=" + genre
				+ "]";
	}
}
