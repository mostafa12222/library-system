package oop;

public class Jornal extends Book {
	private String jornalName;
	private String genre;
    private int refNum;
	public Jornal(int maxNumberOfMembers, int maxNumberOfBooks, String author, String title, String genre, int refNum,
			String jornalName, String genre2, int refNum2) {
		super(maxNumberOfMembers, maxNumberOfBooks, author, title, genre, refNum);
		this.jornalName = jornalName;
		genre = genre2;
		refNum = refNum2;
	}
	public String getJornalName() {
		return jornalName;
	}
	public void setJornalName(String jornalName) {
		this.jornalName = jornalName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRefNum() {
		return refNum;
	}
	public void setRefNum(int refNum) {
		this.refNum = refNum;
	}
	@Override
	public String toString() {
		return "Jornal [jornalName=" + jornalName + ", genre=" + genre + ", refNum=" + refNum + "]";
	}
    
}
