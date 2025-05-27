package lesson1;

import java.util.HashMap;

public class addCharsHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to add all the characters of a string in a HashMap
/*	String str = "My Interview Questions";
	HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	char [] c = str.toCharArray();
	int k=1;   //This has been used to add consecutive sequence, else it will add index for spaces also
	for (int i=1;i<str.length();i++)   {
	if (c[i]!=' ')   {
	hm.put(k, c[i]);
//  hm.put(i, c[i]);	//This will add up exact index as there are spaces also
	k++;
	}
	}
	System.out.println(hm);   */
	
//  For Practice
	String str = "My Interview Questions";
	HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	char [] c = str.toCharArray();
	int k=1;
	for (int i=0;i<str.length();i++)   {
	if (c[i]!=' ')   {
    hm.put(k, c[i]);
//	hm.put(i, c[i]);	
	k++;
	}
	}
	System.out.println(hm);
	
	}

}
