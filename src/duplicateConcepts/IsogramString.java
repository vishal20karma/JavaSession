package duplicateConcepts;

import java.util.HashMap;

public class IsogramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Checking if String is an Isogram or not, Isogram means there should not be any repeating characters
/*	String s = "Isogram";
	boolean b = isogramOrNot(s);
	System.out.println(b);
	
	}
	
	public static boolean isogramOrNot(String s)   {
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
    System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>1)   {
	return false;	
	}
	}
	return true;   */
		
//  For Practice
	String s = "Isogram";
	boolean b = isogramOrNot(s);
	System.out.println(b);
	
	}
		
	public static boolean isogramOrNot(String s)   {
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>1)   {
	return false;	
	}
	}
	return true;	
	}

}
