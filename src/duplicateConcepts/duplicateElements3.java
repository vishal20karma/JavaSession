package duplicateConcepts;

import java.util.HashSet;
import java.util.Set;

public class duplicateElements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to remove duplicate elements from an Array
/*	String [] s1 = {"c","java","python","ruby","c++","cobol","c","java"};	
	Set<String> store = new HashSet<String>();
	for (String names:s1)   {
	store.add(names);	
	}
	System.out.println(store);   //This will print in brackets
	String s2 [] = store.toArray(size->new String [size]);
	for (String s3:s2)   {
	System.out.println(s3);	
	}   */
	
//  For Practice
	String [] s1 = {"c","java","python","ruby","c++","cobol","c","java"};
	Set<String> store = new HashSet<String>();
	for (String names:s1)   {
	store.add(names);
	}
	System.out.println(store);
	String [] s2 = store.toArray(size->new String [size]);
	for (String s3:s2)   {
	System.out.println(s3);	
	}

	}
}
