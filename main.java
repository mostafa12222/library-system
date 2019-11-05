package oop;

import java.util.*;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[]args )  {
		String name1;
		Scanner in =new Scanner(System.in);
		Library l=new Library(5,5);
		boolean Continue =true ;
		while (Continue == true) 
		{
        int n=123;
		String input=JOptionPane.showInputDialog("welcom to library System"+" Under  supervision of Dr.Safia :) "+"\n"+""+"\n"+" login As :)"+"\n"+""+"\n"+"Select (1) if Student"+"\n"+""+"\n"+"Select (2) if librian"+"\n"+""+"\n"+"Please Choic Your Login");
		int x=Integer.parseInt(input);
	if (x==1) {
    String name;
    String telephone;
     name=JOptionPane.showInputDialog("please Enter Name"); 
	 telephone=JOptionPane.showInputDialog("please Enter Telephone");
	String ID=JOptionPane.showInputDialog("please Enter ID");
	 int id=Integer.parseInt(ID);
	Member m=new Member(1, 1, name, telephone, id);
	m.print();
	JOptionPane.showMessageDialog(null, "=========================================================="+"\n"+"Select (1)  if borrow book"+"\n"
	+"Select (2) if read here"+"\n"+"Select (3) Search about book"+"\n"+"Select (4) if Exit");
	String k=JOptionPane.showInputDialog(null, "Please Choice any Transaction");
	int y = Integer.parseInt(k);
	switch(y) {
	case (1):
	name1=JOptionPane.showInputDialog("please enter book name will borrowing ");
	JOptionPane.showMessageDialog(null, "Book ("+name1+") make sure to return it before only 7 days ");
		break;
	case (2): 
		String n1=JOptionPane.showInputDialog("please enter book name ");
	JOptionPane.showMessageDialog(null,"you can sit on table 7 :)"+"\n"+ "book number is 23");
		break;
	case (3): 
		String n2=JOptionPane.showInputDialog("please enter book name ");        
        Book b=new Book(1, 1, "mohamed", n2, "2000", 1);
        b.print();
		break;
	case (4): Continue=false;
		break;
	default:
		JOptionPane.showMessageDialog(null, "your choice is not in the range !!! ");
		break;
	}
}
	
else if(x==2) {
	String lm=JOptionPane.showInputDialog(null,"please enter your password");
	int b = Integer.parseInt(lm);
        if (b==n) {
    		JOptionPane.showMessageDialog(null, "Welcome :) please select your task"+"\n"+"1-Add book"
    	    		+"\n"+"2-Remove book"+"\n"+"3-Search about book"+"\n"+"4-Student want to borrow book "+"\n"+
    	    		"5-Add member"+"\n"+"6-Remove member"+"\n"+"7_Exit");    		
    		String lm2=JOptionPane.showInputDialog(null, "Please Choice any Transaction");
    		int a = Integer.parseInt(lm2);
    		switch(a) {
    		case (1):
        	String Author=JOptionPane.showInputDialog(null, "Enter Book Author");
    		String title=JOptionPane.showInputDialog(null, "Enter Book Title ");
    		String mn=JOptionPane.showInputDialog(null, "Enter Book Reference");
    		int ref=Integer.parseInt(mn);
    		String gen=JOptionPane.showInputDialog(null, "Enter Book Generation");
    		l.addBook(Author, title, ref, gen);
    			break;
    		case (2): 
        	String b2=JOptionPane.showInputDialog(null, "Please Enter Book Will Removed");
    		JOptionPane.showMessageDialog(null, "Book Deleted");
    			break;
    		case (3): 
            	String n2=JOptionPane.showInputDialog(null, "please enter book name ");
                Book b5=new Book(1, 1, "mohamed", n2, "2000", 1); 
                b5.print();
    		    break;
    		case (4): 
            String name5=JOptionPane.showInputDialog(null, "Enter Book To borrow");
    		JOptionPane.showMessageDialog(null, "book Borrowed "+name5+"\n"+ "will  return it before only 7 days ");
    			break;
    		case (5): 
    			 String name;
    	    String telephone;
           name=JOptionPane.showInputDialog(null, "please enter your Name");
           telephone=JOptionPane.showInputDialog(null, "please Enter Telephone");
           String telephon=JOptionPane.showInputDialog(null, "please enter your ID");
    		int id = Integer.parseInt(telephon);
    		l.addMember(name, telephone, id);
    			break;
    		case (6): 
    	    String b3=JOptionPane.showInputDialog(null, "Please Enter Member Will Removed");
    		JOptionPane.showMessageDialog(null, "Member Deleted");
    			break;
    		case (7):
    			Continue=false;
    			break;
    default:
	JOptionPane.showMessageDialog(null, "your choice is not in the range !!! ");
	break;
    		}
        }
        else {
        	JOptionPane.showMessageDialog(null, "wrong password !!!");
        }
        }
	}
	}
	}