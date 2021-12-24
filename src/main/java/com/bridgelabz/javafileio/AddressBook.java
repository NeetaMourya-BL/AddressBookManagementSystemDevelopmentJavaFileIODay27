package com.bridgelabz.javafileio;
import java.util.HashMap;

public class AddressBook {

	public static void main(String[] args) {
    System.out.println("AddressBook");    
    new AddressBook();
	}
	 public AddressBook() {
		 HashMap<Integer, String> hashMap = new HashMap<Integer, String>();           
		 hashMap.put(1,"AddressBook1");  
		 hashMap.put(2,"AddressBook2");  
		 hashMap.put(3,"AddressBook3");  
		 hashMap.put(4,"AddressBook4");
		 hashMap.put(5,"AddressBook5");
		 System.out.println("AddressBook"+hashMap);    
	    }
}