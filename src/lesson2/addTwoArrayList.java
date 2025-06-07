package lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class addTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add two ArrayList
/*	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Suman");
	a.add("Ranjan");
	a.add("Sushant");   */
		
//  For Practice
	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Suman");
	a.add("Ranjan");
	a.add("Sushant");
	
/*	ArrayList<String> b = new ArrayList<String>();
	b.add("Vikrant");
	b.add("Ravi");
	b.add("Kia");
	b.add("Rohit");
	b.add("Anand");   */
	
//  For Practice
	ArrayList<String> b = new ArrayList<String>();
	b.add("Vikrant");
	b.add("Ravi");
	b.add("Kia");
	b.add("Rohi");
	b.add("Anand");
	
/*	Stream<String> name1 = a.stream();
	Stream<String> name2 = b.stream();
	List<String> names = Stream.concat(name1, name2).toList();
	System.out.println(names);   //Directly printing the ArrayList, it prints with bracket
	for (String s:names)   {
	System.out.println(s);	
	}   */
	
//  For Practice
	Stream<String> name1 = a.stream();
	Stream<String> name2 = b.stream();
	List<String> names  = Stream.concat(name1, name2).toList();
	System.out.println(names);
	for (String s:names)   {
	System.out.println(s);
	}
	
	System.out.println("*************************************");

//  Easiest Method, direct addition
/*	a.addAll(b);
	System.out.println(a);   */   //Only 'a' parameter need to give as 'b' has been already added to 'a', this print entire names in bracket
	
//  For Practice
	a.addAll(b);
	System.out.println(a);
	
	}

}
