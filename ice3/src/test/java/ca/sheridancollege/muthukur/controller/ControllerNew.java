package ca.sheridancollege.muthukur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.muthukur.Rectangle;

@Controller
public class ControllerNew {

	@Autowired
	private Rectangle rectangle;
	
	@GetMapping("/")
	public String index (Model model) {
		rectangle.setDimensions(5,3);
		int area = rectangle.calculateArea();
		System.out.println("Area of the rectangle:" + area);
		return "index";
	}
}
