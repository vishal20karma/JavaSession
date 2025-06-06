package lesson5;

import java.util.LinkedHashMap;

public class frstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	First non repeated character in String
/*	String s = "Atlantic";
	s=s.toLowerCase();
	LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)==1)   {
	System.out.println(key);
	break;
	}
	}   */
	
//  For Practice	
	String s = "Atlantic";
	s=s.toLowerCase();
	LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)==1)   {
	System.out.println(key);
	break;
	}
	}
	
	}

}
