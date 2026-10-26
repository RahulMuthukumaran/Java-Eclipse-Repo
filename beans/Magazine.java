package ca.sheridancollege.muthukur.beans;

public class Magazine 
{
	private Long ID;
	private String name;
	private Integer issno;
	private Double price;
	private String publisher;
	private String frequency;
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIssno() {
		return issno;
	}

	public void setIssno(Integer issno) {
		this.issno = issno;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Magazine [ID=" + ID + ", name=" + name + ", issno=" + issno + ", price=" + price + ", publisher="
				+ publisher + ", frequency=" + frequency + "]";
	}
	
	
}
