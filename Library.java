package oop;

import java.util.*;

import javax.swing.JOptionPane;
public class Library
{
   private String libraryName;
   private String address;
   private String openingTimes;
   private List<Member> members;
   private List<Book> books;
   private int capacity;
   private int bookCapacity;
   private String name;
   private int id; 
   private String tele;
   private String author;
   private String title;
   private int refNum;
   private String genre;
    public Library(int maxNumberOfMembers, int maxNumberOfBooks)
    {
        libraryName = "Library";
        address = "Future Academy";
        openingTimes = "Open saturday - thursday (9am-3pm)";
        members = new ArrayList<Member>();
        books = new ArrayList<Book>();
        capacity = maxNumberOfMembers;
        bookCapacity = maxNumberOfBooks;
    }


    /**
     * Add a member to this Library.
     */
    public void addMember(String fullName, String telephoneNumber,int id)
    {
        // if the member capacity has been reached
        if(members.size() == capacity) {
            // do this
            System.out.println("The Library is not currently taking new members as we are full, please enroll at a different library.");
        }
        //otherwise do this:
        else {
             name = fullName;
             tele = telephoneNumber;
             this.id = id;
             JOptionPane.showMessageDialog(null, "Member Added");
        }
    }

    /**
     * Add a book to this Library.
     */
    public void addBook(String bookAuthor, String bookTitle, int bookRef, String bookGenre)
    {
         // if the book capacity has been reached   
        if(books.size() == capacity) {
            //do this
            System.out.println("The Library currently does not have space for new books."); 
        }
        //otherwise do this:
        else {
            author = bookAuthor;
            title = bookTitle;
            refNum = bookRef;
            genre = bookGenre;
            JOptionPane.showMessageDialog(null, "Book Added");
        }
    }

    /**
     * Return the number of members currently enrolled in this Library.
     */
    public int numberOfMembers()
    {
        return members.size(); //returns an integer number of how many members are in the arrayList <Member>
    }

    /**
     * Return the number of books currently registered in this Library.
     */
    public int numberOfBooks()
    {
        return books.size(); //returns an integer number of how many books are in the arrayList <Book>
    }

    /**
     * Set the Name for this Library.
     */
    public void changeLibraryName(String LibName)
    {
        libraryName = LibName; //enter a string value to mutate the library name
    }

    /**
     * alter the opening times for this Library. The parameter should define the opening hour
     * and the closing time, such as "open Mon - Friday: 10am - 5pm".
     */
    public void changeOpeningTimes(String timeAndDayString)
    {
        openingTimes = timeAndDayString; //enter a string value to mutate the library opening times
    }

    /**
     * Alter the street address of the library.
     */
    public void changeAdress(String streetAddress)
    {
        address = streetAddress; //enter a string value to mutate the library treet address
    }

    /**
     * Print out a member list to the standard
     * terminal.
     */
    public void printMemberList()
    {
        System.out.println("***************************"); //header
        System.out.println("LibraryName " + libraryName);
        System.out.println("Address:" + address);
        System.out.println("Opening Times:" + openingTimes);
        System.out.println("-------------------------------"); //break
        System.out.println("Member list:");
        for(Member member : members) {
            member.print();
        }
        System.out.println("Number of members: " + numberOfMembers());
        System.out.println("***************************"); //footer
    }

     /**
     * Print out a book list to the standard
     * terminal.
     */
    public void printBookList()
    {
        System.out.println("***************************"); //header
        System.out.println("LibraryName " + libraryName);
        System.out.println("Address:" + address);
        System.out.println("Opening Times:" + openingTimes);
        System.out.println("-------------------------------"); //break
        System.out.println("Book list:");
        for(Book book : books) {
            book.print();
        }
        System.out.println("Number of books: " + numberOfBooks());
        System.out.println("***************************"); //footer
}
}