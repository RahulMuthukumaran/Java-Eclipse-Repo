package ca.sheridancollege.muthukur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThursController {

	
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}	
	
	@GetMapping("/test")
	public String indexTest(Model model) {
	model.addAttribute("greeting", "test: greeting");
	return "test";
	}
	
	@GetMapping("/sayBye")
	public String indexBye(Model model) {
	model.addAttribute("farewell", "test: see ya never");
	return "sayBye";
	}
	
	@GetMapping("/sayHi")
	public String indexHi(Model model) {
	model.addAttribute("hai", "hi hai hiya hii haiii");
	return "sayHi";
	}
}
