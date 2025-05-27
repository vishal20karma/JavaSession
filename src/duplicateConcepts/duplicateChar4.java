package duplicateConcepts;

import java.util.HashMap;

public class duplicateChar4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to get repeated characters in a string by using HashMap
/*	String s = "My Great Responsibilities";
	s=s.toLowerCase();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (c!=' ')   {
	if (hm.containsKey(c))   {
	int oldFreq = hm.get(c);	
	int newFreq = oldFreq+1;
	hm.put(c, newFreq);
	}
	else {
	hm.put(c, 1);	
	}
	}
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>1)   {   //'key' means the original character here, 'hm.get(key)' means the key's value
	System.out.println("Duplicate- "+key+" : "+hm.get(key));
	}
	}   */
		
//  For Practice
	String s = "My Great Responsibilities";
	s=s.toLowerCase();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (c!=' ')   {
	if (hm.containsKey(c))   {
	int oldFreq = hm.get(c);
	int newFreq = oldFreq+1;
	hm.put(c, newFreq);
	}
	else {
	hm.put(c, 1);	
	}
	}
	}
	System.out.println(hm);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>1)   {
	System.out.println(key+" : "+hm.get(key));	
	}
	}
	
	System.out.println("*****************************************");
	
//  Another and shorter method by using HashMap
/*	String str = "My Great Responsibilities";
	str=str.toLowerCase();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c!=' ')   {
	map.put(c, map.getOrDefault(c, 0)+1);	
	}
	}
	System.out.println(map);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>1)   {
	System.out.println("Duplicate-"+key+" : "+hm.get(key));	
	}
	}   */
	
//  For Practice
	String str = "My Great Responsibilities";
	str=str.toLowerCase();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (c!=' ')   {
	map.put(c, map.getOrDefault(c, 0)+1);	
	}
	}
	System.out.println(map);
	for (Character key:map.keySet())   {
	if (map.get(key)>1)   {
	System.out.println("Duplicate- "+key+" : "+map.get(key));
	}
	}
	
	}

}
