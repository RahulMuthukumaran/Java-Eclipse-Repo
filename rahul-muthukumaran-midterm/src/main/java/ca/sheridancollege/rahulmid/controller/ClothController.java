package ca.sheridancollege.rahulmid.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.rahulmid.beans.Clothing;
import ca.sheridancollege.rahulmid.database.DatabaseAccess;

@Controller
public class ClothController {

	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String index(Model model) {
		
		da.insertClothingHardCoded();
		model.addAttribute("clothing", new Clothing());
		model.addAttribute("clothingList", da.getClothingList());
		return "index";
	}
	
	@PostMapping("/insertClothing")
	public String insertClothing(Model model, @ModelAttribute Clothing clothing) {
	da.insertClothing(clothing);
	model.addAttribute("clothing", new Clothing());
	model.addAttribute("clothingList", da.getClothingList());
	return "index";
	}
	@PostMapping("/searchClothing")
	public String searchClothing(Model model, @ModelAttribute Clothing clothing) {
	da.searchClothing(clothing);
	model.addAttribute("clothing", new Clothing());
	model.addAttribute("clothingList", da.getClothingList());
	model.addAttribute(da.searchClothing(clothing));
	return "index";
	}
	
	@GetMapping("/editClothingById/{id}")
	public String editClothingById(Model model, @PathVariable Long id) {
		
		Clothing clothing = da.getClothingListById(id).get(0);
		
		da.updateClothing(clothing);
		
		model.addAttribute("clothing", clothing);
		model.addAttribute("clothingList", da.getClothingList());
		
		return "index";
	}


@PostMapping("/insertClothing")
	public String insertClothing(Model model, @ModelAttribute Clothing clothing) {
		
		
		List<Clothing> existingClothings = da.getClothingListById(clothing.getId());
		
		if (existingClothings.isEmpty()) {
	        // If the clothing doesn't exist (based on ID), insert a new clothing
	        da.insertClothing(clothing);
	    } else {
	        // If the clothing exists, update the existing clothing
	        da.updateClothing(clothing);
	    }
		
		model.addAttribute("clothingList", da.getClothingList());
		model.addAttribute("clothing", new Clothing());
		
		return "index";
	}
}

