package duplicateConcepts;

import java.util.HashSet;

public class duplicateChar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find the duplicate characters in a string without nested loop or by using HashSet	
/*	String str = "My Great Responsibility";
	str=str.toLowerCase().replaceAll("\\s", "");
	char [] c = str.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	for (Character chr:c)   {
	int count=1;
	if (hs.add(chr)==false)   {
	count++;
	System.out.println(chr+" : "+count);	
	}
	}
	System.out.println(hs);   */
		
//  For Practice
	String str = "My Great Responsibility";
	str=str.toLowerCase().replaceAll("\\s", "");
	char [] c = str.toCharArray();
	HashSet<Character> hs = new HashSet<Character>();
	for (Character chr:c)   {
	int count=1;
	if (hs.add(chr)==false)   {
	count++;
	System.out.println(chr+" : "+count);	
	}
	}
	
	}

}
