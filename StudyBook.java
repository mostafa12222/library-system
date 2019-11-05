package oop;

public class StudyBook extends Book{
	private String StudyBookName;
	private String genre;
    private int refNum;
	public StudyBook(int maxNumberOfMembers, int maxNumberOfBooks, String author, String title, String genre,
			int refNum, String studyBookName, String genre2, int refNum2) {
		super(maxNumberOfMembers, maxNumberOfBooks, author, title, genre, refNum);
		StudyBookName = studyBookName;
		genre = genre2;
		refNum = refNum2;
	}
	public String getStudyBookName() {
		return StudyBookName;
	}
	public void setStudyBookName(String studyBookName) {
		StudyBookName = studyBookName;
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
		return "StudyBook [StudyBookName=" + StudyBookName + ", genre=" + genre + ", refNum=" + refNum + "]";
	}
    
}
