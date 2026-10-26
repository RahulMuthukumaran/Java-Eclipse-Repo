package ca.sheridancollege.muthukur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.muthukur.beans.Student;
import ca.sheridancollege.muthukur.beans.Teacher;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/student")
	public String student() {
		return "student";
	}
	@GetMapping("/teacher")
	public String teacher() {
		return "teacher";
	}
	
	@PostMapping("/formPostStudent")
	public String formPostStudent (@RequestParam String firstName, @RequestParam String lastName) 
	{
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		System.out.println(student);
		return "working";
	}
	@PostMapping("/formPostTeacher")
	public String formPostTeacher (@RequestParam String firstName, @RequestParam String lastName, @RequestParam String faculty, @RequestParam String subject) 
	{
		Teacher teacher = new Teacher();
		teacher.setFirstName(firstName);
		teacher.setLastName(lastName);
		teacher.setFaculty(faculty);
		teacher.setSubject(subject);
		System.out.println(teacher);
		return "working";
	}
	
}


