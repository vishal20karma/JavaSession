package duplicateConcepts;

import java.util.HashSet;

public class duplicateChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find the duplicate characters in a string without nested loop or by using HashSet	
/*	String str = "My Great Responsibility";
	char [] c = str.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	for (Character ch:c)   {
	int count=1;
	if ((ch!=' ') && (hs.add(ch)==false))   {
	count++;
	System.out.println(ch+" : "+count);
	}
	}
	System.out.println(hs);   */
		
//  For Practice
	String str = "My Great Responsibility";
	char [] c = str.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	for (Character ch:c)   {
	int count=1;
	if ((ch!=' ') && (hs.add(ch)==false))   {
	count++;
	System.out.println(ch+" : "+count);
	}
	}
	System.out.println(hs);
	
	}

}
