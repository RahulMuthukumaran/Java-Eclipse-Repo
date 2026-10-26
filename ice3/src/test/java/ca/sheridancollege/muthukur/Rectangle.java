package ca.sheridancollege.muthukur;

import org.springframework.stereotype.Component;

@Component
public class Rectangle {
	private int length;
	private int width;

	public void setDimensions(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int calculateArea() {
		return length*width;
	}
}