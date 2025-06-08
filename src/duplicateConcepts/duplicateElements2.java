package duplicateConcepts;

import java.util.HashSet;

public class duplicateElements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Finding duplicate elements through HashSet or alternative method	
/*	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
	HashSet<String> store = new HashSet<String>();
	for (String names:s)   {
	int count=1;
	if (store.add(names)==false)   {
	count++;
	System.out.println(names+" : "+count);
	}
	}   */
		
//  For Practice
	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
	HashSet<String> store = new HashSet<String>();
	for (String names:s)   {
	int count=1;
	if (store.add(names)==false)   {
	count++;
	System.out.println(names+" : "+count);
	}
	}
	
	}

}
