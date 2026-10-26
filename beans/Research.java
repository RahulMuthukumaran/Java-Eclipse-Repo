package ca.sheridancollege.muthukur.beans;

import java.time.LocalDate;

public class Research {
	private Long ID;
	private String title;
	private String author;
	private Double price;
	private String fos;
	private LocalDate pubdate;
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
	public String getFos() {
		return fos;
	}
	public void setFos(String fos) {
		this.fos = fos;
	}
	public LocalDate getPubdate() {
		return pubdate;
	}
	public void setPubdate(LocalDate pubdate) {
		this.pubdate = pubdate;
	}
	@Override
	public String toString() {
		return "Research [ID=" + ID + ", title=" + title + ", author=" + author + ", price=" + price + ", fos=" + fos
				+ ", pubdate=" + pubdate + "]";
	}
	
}
