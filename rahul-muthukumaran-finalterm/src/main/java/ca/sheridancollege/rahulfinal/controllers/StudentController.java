package ca.sheridancollege.rahulfinal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.rahulfinal.beans.Student;
import ca.sheridancollege.rahulfinal.database.DatabaseAccess;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
@Autowired
private DatabaseAccess da;
// Other methods

//get entire list
@GetMapping
public List<Student> getStudentCollection() {
return da.findAll();
}


//get students by campus
@GetMapping(value = "/{campus}")
public Student getIndividualStudent(@PathVariable String campus) {
return da.findByCampus(campus);
}

//make new student
@PostMapping(consumes = "application/json")
public String postStudent(@RequestBody Student student) {
return "http://localhost:8080/api/v1/students/" + da.save(student);
}

//update existing student by selecting id of student to edit
@PostMapping(value = "/{id}")
public String updateStudent(@PathVariable Long id, @RequestBody Student student) {
	return "http://localhost:8080/api/v1/students/" + da.saveById(student, student.getId());
}

//delete student by name
@DeleteMapping(value = "/{name}")
public Student deletedStudent(@PathVariable String name) {
	return da.deleteByName(name);
	
}
}