package ca.sheridancollege.muthukur.beans;

public class NonFiction {
	private Long ID;
	private String title;
	private String author;
	private Double price;
	private String subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "NonFiction [ID=" + ID + ", title=" + title + ", author=" + author + ", price=" + price + ", subject=" + subject
				+ "]";
	}
}