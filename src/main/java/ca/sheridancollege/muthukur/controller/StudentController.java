package ca.sheridancollege.muthukur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.muthukur.beans.Student;
import ca.sheridancollege.muthukur.database.DatabaseAccess;

@Controller
public class StudentController {

	@Autowired
	private DatabaseAccess da;
	
	@GetMapping("/")
	public String index(Model model) {
		
		da.insertStudentHardCoded();
		model.addAttribute("student", new Student());
		model.addAttribute("studentList", da.getStudentList());
		return "index";
	}
	
	@PostMapping("/insertStudent")
	public String insertStudent(Model model, @ModelAttribute Student student) {
	da.insertStudent(student);
	model.addAttribute("student", new Student());
	model.addAttribute("studentList", da.getStudentList());
	return "index";
	}
	@PostMapping("/searchStudent")
	public String searchStudent(Model model, @ModelAttribute Student student) {
	da.searchStudent(student);
	model.addAttribute("student", new Student());
	model.addAttribute("studentList", da.getStudentList());
	model.addAttribute(da.searchStudent(student));
	return "index";
	}
	
	@GetMapping("/editStudentById/{id}")
	public String editStudentById(Model model, @PathVariable Long id) {
		
		Student student = da.getStudentListById(id).get(0);
		
		da.updateStudent(student);
		
		model.addAttribute("student", student);
		model.addAttribute("studentList", da.getStudentList());
		
		return "index";
	}


@PostMapping("/insertStudent")
	public String insertStudent(Model model, @ModelAttribute Student student) {
		
		
		List<Student> existingStudents = da.getStudentListById(student.getId());
		
		if (existingStudents.isEmpty()) {
	        // If the student doesn't exist (based on ID), insert a new student
	        da.insertStudent(student);
	    } else {
	        // If the student exists, update the existing student
	        da.updateStudent(student);
	    }
		
		model.addAttribute("studentList", da.getStudentList());
		model.addAttribute("student", new Student());
		
		return "index";
	}
}
