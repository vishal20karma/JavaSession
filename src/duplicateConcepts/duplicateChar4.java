package duplicateConcepts;

import java.util.HashMap;

public class duplicateChar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to get repeated characters in a string by using HashMap
/*	String str = "My Greatest Responsibilities";
	str=str.toLowerCase().replaceAll("\\s", "");
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i=0;i<str.length();i++)   {
    char c = str.charAt(i);	
    map.put(c, map.getOrDefault(c, 0)+1);
    }
    System.out.println(map);
	for (Character key:map.keySet())   {
	if (map.get(key)>1)   {
	System.out.println("Duplicate-"+key+" : "+map.get(key));	
	}
	}   */
	
//  For Practice
	String str = "My Greatest Responsibilities";
	str=str.toLowerCase().replaceAll("\\s", "");
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	map.put(c, map.getOrDefault(c, 0)+1);
	}
	System.out.println(map);
	for (Character key:map.keySet())   {
	if (map.get(key)>1)   {
	System.out.println(key+" : "+map.get(key));	
	}
	}
	
	
//  How to get the frequency of all the characters with HashMap	
/*	String s = "My New Great Responsibilities";
	s=s.toLowerCase();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (c!=' ')   {
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>0)   {
	System.out.println(key+" : "+hm.get(key));
	}
	}   */
	
//  For Practice
	String s = "My New Great Responsibilities";
	s=s.toLowerCase().replaceAll("\\s", "");
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>0)   {
	System.out.println(key+" : "+hm.get(key));
	}
	}
		
	}

}
