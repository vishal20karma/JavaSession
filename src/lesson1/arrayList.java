package lesson1;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//  ArrayList is dynamic and values can be added to the list ongoing
/*	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vishakha");
	a.add("Vijay");
	a.add("Vivek");
	a.add("Vikrant");
	System.out.println(a.get(2));   */
		
//  For Practice
	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vishakha");
	a.add("Vijay");
	a.add("Vivek");
	a.add("Vikrant");
	System.out.println(a.get(2));
	
	System.out.println("************************************");
	
/*	for (int i=0;i<a.size();i++)   {
	System.out.println(a.get(i));
	}   */
	
//  For Practice
	for (int i=0;i<a.size();i++)   {
	System.out.println(a.get(i));	
	}
	
	System.out.println("************************************");
	
/*	for (String s:a)   {
	System.out.println(s);	
	}   */
	
//  For Practice
	for (String s:a)   {
	System.out.println(s);	
	}
	
	System.out.println("************************************");
	
/*	System.out.println(a.contains("Vikrant"));  //In ArrayList we can use contains method to check the values, it returns boolean
    System.out.println(a.contains("Vimal"));    */   //Contains method can only be used in ArrayList, not in Array, so first have to convert Array to ArrayList then only contains can be used
	
	System.out.println(a.contains("Vikrant"));
	System.out.println(a.contains("Vimal"));
	
	}

}
