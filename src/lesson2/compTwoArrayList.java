package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Comparing two ArrayLists
//	ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
//	ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
//	ArrayList<String> a3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	ArrayList<String> a3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	
/*	Collections.sort(a1);   //This is the way to sort ArrayList, if not sort then compare will not work properly even if elements are equal
	Collections.sort(a2);
	Collections.sort(a3);
	System.out.println(a1.equals(a2));   //False - values are different
	System.out.println(a1.equals(a3));   */   //True - values are same
	
//  For Practice
	Collections.sort(a1);
	Collections.sort(a2);
	Collections.sort(a3);
	System.out.println(a1.equals(a2));
	System.out.println(a1.equals(a3));
	
//  Comparing two list and finding the additional element
/*	a1.removeAll(a2);   //This removes all a2 elements form a1
	System.out.println(a1);   */
	
//  For Practice
	a1.removeAll(a2);
	System.out.println(a1);
	
//  Comparing two list and finding the missing element
/*	a2.removeAll(a3);
	System.out.println(a2);   */
	
//  For Practice
	a2.removeAll(a3);
	System.out.println(a2);
	
//  Finding common elements
/*	ArrayList<String> a4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	ArrayList<String> a5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	a4.retainAll(a5);
	System.out.println(a4);   */
	
//  For Practice
	ArrayList<String> a4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
	ArrayList<String> a5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	a4.retainAll(a5);
	System.out.println(a4);
	
	}

}
