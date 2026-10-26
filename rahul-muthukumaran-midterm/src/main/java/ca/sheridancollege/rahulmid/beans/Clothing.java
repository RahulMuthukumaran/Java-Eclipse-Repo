package ca.sheridancollege.rahulmid.beans;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Clothing {
	private Long id;
	private String brand;
	private Double price;
	private String size;
	private String colour;
	private String Type;
	private String Target;

	public Clothing() {
		
	}
	
	public Clothing(Long id, String brand, Double price, String size, String colour, String type, String target) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.colour = colour;
		Type = type;
		Target = target;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getTarget() {
		return Target;
	}
	public void setTarget(String target) {
		Target = target;
	}
}

