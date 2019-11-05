package oop;

import javax.swing.JOptionPane;

public class Member extends Library {
	private String fullName;
	private String telephoneNumber;
	private int id;
	
	public Member(int maxNumberOfMembers, int maxNumberOfBooks, String fullName, String telephoneNumber, int id) {
		super(maxNumberOfMembers, maxNumberOfBooks);
		this.fullName = fullName;
		this.telephoneNumber = telephoneNumber;
		this.id = id;
	}

	public void print() {
		
       JOptionPane.showMessageDialog(null, "Member name = " +fullName+"\n"+"Member Telephone = " 
       +telephoneNumber+"\n"+"ID = " +id+"\n"+"----------------------------------------------------");
	}

}
