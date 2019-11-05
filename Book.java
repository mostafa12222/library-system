package oop;

import javax.swing.JOptionPane;

class Book extends Library
{
    // The fields.
    private String author;
    private String title;
    private String genre;
    private int refNum;
  
    public Book(int maxNumberOfMembers, int maxNumberOfBooks, String author, String title, String genre, int refNum) {
		super(maxNumberOfMembers, maxNumberOfBooks);
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.refNum = refNum;
	}

	public void print()
    {        JOptionPane.showMessageDialog(null, "Author = " +author+"\n"+"Title = " +title+"\n"+"Book Reference = " +refNum+"\n"+"This book can be found in the " +genre + " section"
        +"\n"+"----------------------------------------------------");
        		}

}
