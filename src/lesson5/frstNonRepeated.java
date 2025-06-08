package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class frstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	How to find first non repeated character in String
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
	
	System.out.println("***********************************");
	
//  How to find second non repeated character in String
/*	String str = "Atlantic";
	str=str.toLowerCase();
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	map.put(c, map.getOrDefault(c, 0)+1);
	}
	System.out.println(map);
	int count=0;
	for (Character key:map.keySet())   {
	if (map.get(key)==1)   {
	count++;
	if (count==2)   {
	System.out.println(key);
	break;
	}
	}
	}
	if (count<2)   {
	System.out.println("Second non-repeating characters not found");	
	}   */
	
//  For Practice
	String str = "Atlantic";
	str=str.toLowerCase();
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	map.put(c, map.getOrDefault(c, 0)+1);
	}
	System.out.println(map);
	int count=0;
	for (Character key:map.keySet())   {
	if (map.get(key)==1)   {
	count++;	
	if (count==2)   {
	System.out.println(key);	
	}
	}
	}
	if (count<2)   {
	System.out.println("Second non-repeating characters not found");	
	}
	
	}

}
