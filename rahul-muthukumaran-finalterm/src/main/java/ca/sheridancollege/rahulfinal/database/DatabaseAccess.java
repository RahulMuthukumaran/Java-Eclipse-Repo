package ca.sheridancollege.rahulfinal.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.rahulfinal.beans.Student;

@Repository
public class DatabaseAccess {
@Autowired
protected NamedParameterJdbcTemplate jdbc;
// Other methods

//findAll()
public List<Student> findAll() {
MapSqlParameterSource namedParameters = new
MapSqlParameterSource();
String query = "SELECT * FROM student";
return jdbc.query(query, namedParameters, new
BeanPropertyRowMapper<Student>(Student.class));
}

//find by campus
public Student findByCampus(String campus) {
	MapSqlParameterSource namedParameters = new MapSqlParameterSource();
	String query = "SELECT * FROM student WHERE campus = :campus";
	namedParameters.addValue("campus", campus);
	return jdbc.queryForObject(query, namedParameters, new
	BeanPropertyRowMapper<Student>(Student.class));	
}

// post new student
public Long save(Student student) {
MapSqlParameterSource namedParameters = new
MapSqlParameterSource();
GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
String query = "INSERT INTO student(name) VALUES(:name)";
namedParameters.addValue("name", student.getName());
jdbc.update(query, namedParameters, generatedKeyHolder);
return (Long) generatedKeyHolder.getKey();
}

//update student by ID
public Long saveById(Student student, Long id) {
	deleteByName(student.getName());
	MapSqlParameterSource namedParameters = new
	MapSqlParameterSource();
	GeneratedKeyHolder generatedKeyHolder = new GeneratedKeyHolder();
	String query = "INSERT INTO student(id) VALUES(:id)";
	namedParameters.addValue("name", student.getName());
	jdbc.update(query, namedParameters, generatedKeyHolder);
	return (Long) generatedKeyHolder.getKey();
	
}

// delete by name
public Student deleteByName(String name) {
MapSqlParameterSource namedParameters = new
MapSqlParameterSource();
String query = "DELETE * FROM student WHERE name = :name";
namedParameters.addValue("name", name);
jdbc.update(query, namedParameters);
return jdbc.queryForObject(query, namedParameters, new BeanPropertyRowMapper<Student>(Student.class));
}
}