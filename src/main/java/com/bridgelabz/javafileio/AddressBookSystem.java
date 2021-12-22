package com.bridgelabz.javafileio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBookSystem {
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program");
	createContact();
	addContact();
	editContact();
}
public static List<Contact> createContact(){
	List<Contact> contacts = new ArrayList<Contact>();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First Name: ");
    String firstName = scanner.next();
    System.out.println("Enter Last Name: ");
    String lastName = scanner.next();
    System.out.println("Enter address:");
    String address=scanner.next();
    System.out.println("Enter city:");
    String city=scanner.next();
    System.out.println("Enter state:");
    String state=scanner.next();
    System.out.println("Enter zip:");
    String zip=scanner.next();
    System.out.println("Enter phone Number:");
    String phoneNumber=scanner.next();
    System.out.println("Enter email:");
    String email=scanner.next();
    contacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
    System.out.println(contacts);
    return contacts;
}
public static List<Contact> addContact(){
	System.out.println("Would you like to add more contact");
	List<Contact> contacts = new ArrayList<Contact>();
	Scanner scanner=new Scanner(System.in);
    System.out.println("Enter First Name: ");
    String firstName = scanner.next();
    System.out.println("Enter Last Name: ");
    String lastName = scanner.next();
    System.out.println("Enter address:");
    String address=scanner.next();
    System.out.println("Enter city:");
    String city=scanner.next();
    System.out.println("Enter state:");
    String state=scanner.next();
    System.out.println("Enter zip:");
    String zip=scanner.next();
    System.out.println("Enter phone Number:");
    String phoneNumber=scanner.next();
    System.out.println("Enter email:");
    String email=scanner.next();
    contacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
    System.out.println(contacts);
    return contacts;
}
public static List<Contact> editContact() {
	List<Contact> editcontacts = new ArrayList<Contact>();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter First Name of person you want to edit: ");
    String firstName = scanner.next();
    System.out.println("Enter new Last Name: ");
    String lastName = scanner.next();
    System.out.println("Enter new address:");
    String address=scanner.next();
    System.out.println("Enter new city:");
    String city=scanner.next();
    System.out.println("Enter new state:");
    String state=scanner.next();
    System.out.println("Enter new zip:");
    String zip=scanner.next();
    System.out.println("Enter new  Number:");
    String phoneNumber=scanner.next();
    System.out.println("Enter new email:");
    String email=scanner.next();
    editcontacts.add(new Contact(firstName, lastName, address, city,state,zip,phoneNumber,email));
    System.out.println(editcontacts);
    return editcontacts;
}
}
