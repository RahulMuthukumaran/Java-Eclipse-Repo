package ca.sheridancollege.rahulfinal.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {
private Long id;
@NonNull private String name;
private String email;
private String campus;
private Integer age;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCampus() {
	return campus;
}
public void setCampus(String campus) {
	this.campus = campus;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
}
