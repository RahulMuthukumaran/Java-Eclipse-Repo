package ca.sheridancollege.muthukur.database;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.muthukur.beans.Student;

@Repository
public class DatabaseAccess {
@Autowired
protected NamedParameterJdbcTemplate jdbc;
public void insertStudentHardCoded() {
MapSqlParameterSource namedParameters = new MapSqlParameterSource();
String query = "INSERT INTO student(name) VALUES ('Frank')";
int rowsAffected = jdbc.update(query, namedParameters);
if (rowsAffected > 0)
System.out.println("Hard coded student inserted into the database");
}
public void insertStudent(Student student) {
MapSqlParameterSource namedParameters = new MapSqlParameterSource();
String query = "INSERT INTO student(name) VALUES (:name)";
namedParameters.addValue("name", student.getName());
int rowsAffected = jdbc.update(query, namedParameters);
if (rowsAffected > 0) {
System.out.println("Student inserted into database");
}
}
public List<Student> searchStudent(Student student) {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	String query = "SELECT * FROM student WHERE LOWER(NAME) = (:name)";
	namedParameters.addValue("name", student.getName());
	return jdbc.query(query, namedParameters, new
	BeanPropertyRowMapper<Student>(Student.class));
}

public List<Student> getStudentList() {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	String query = "SELECT * FROM student";
	return jdbc.query(query, namedParameters, new
	BeanPropertyRowMapper<Student>(Student.class));
}
public void updateStudent(Student updatedStudent) {
    MapSqlParameterSource namedParameters = new MapSqlParameterSource();
    
    String query = "UPDATE student SET name = :name WHERE id = :id";
    namedParameters.addValue("name", updatedStudent.getName());
    namedParameters.addValue("id", updatedStudent.getId());
    
    int rowsAffected = jdbc.update(query, namedParameters);
    
    if (rowsAffected > 0) {
        System.out.println("Updated Student with ID " + updatedStudent.getId() + " in the database.");
    }
}
}