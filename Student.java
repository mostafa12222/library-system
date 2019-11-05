package oop;

public class Student extends Member {
	private String fullName;
	private String telephoneNumber;
	private int id;
	public Student(int maxNumberOfMembers, int maxNumberOfBooks, String fullName, String telephoneNumber, int id,
			String fullName2, String telephoneNumber2, int id2) {
		super(maxNumberOfMembers, maxNumberOfBooks, fullName, telephoneNumber, id);
		fullName = fullName2;
		telephoneNumber = telephoneNumber2;
		id = id2;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", telephoneNumber=" + telephoneNumber + ", id=" + id + "]";
	}
  	
}
