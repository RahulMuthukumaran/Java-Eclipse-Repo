package ca.sheridancollege.muthukur.beans;


public class Teacher
{
	private String firstName;
	private String lastName;
	private String faculty;
	private String subject;
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}

	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Teacher [firstName=" + firstName + ", lastName=" + lastName + ", faculty=" + faculty + ", subject="
				+ subject + "]";
	}
}
