package oop;

public class Faculty extends Book{
	private String fullName;
	private String telephoneNumber;
	private int id;
	public Faculty(int maxNumberOfMembers, int maxNumberOfBooks, String author, String title, String genre, int refNum,
			String fullName, String telephoneNumber, int id) {
		super(maxNumberOfMembers, maxNumberOfBooks, author, title, genre, refNum);
		this.fullName = fullName;
		this.telephoneNumber = telephoneNumber;
		this.id = id;
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
		return "Faculty [fullName=" + fullName + ", telephoneNumber=" + telephoneNumber + ", id=" + id + "]";
	}
	
}
