package replaceConcepts;

import java.util.HashMap;

public class replaceDupsWithCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find duplicates characters and replace them with their duplicate counts
/*	String str = "Automatically";   //3u2om32ic322y
	str=str.toLowerCase();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	map.put(c, map.getOrDefault(c, 0)+1);	
	}
		
    StringBuilder result = new StringBuilder();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (map.get(c)>1)   {
	result.append(map.get(c));   //append only works with StringBuilder or StringBuffer, it will not work with any string variable created
	}
	else {
	result.append(c);
	}
	}
	System.out.println(result.toString());   */

//  For Practice
	String str = "Automatically";
	str=str.toLowerCase();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	map.put(c, map.getOrDefault(c, 0)+1);
	}
	StringBuilder result = new StringBuilder();
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);	
	if (map.get(c)>1)   {
	result.append(map.get(c));
	}
	else {
	result.append(c);	
	}
	}
	System.out.println(result.toString());
	
//  How to replace the characters of a string by same number of counts it has in the string
	String strNew = "Automatically";
	strNew =strNew.toLowerCase();
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<strNew.length();i++)   {
	char c = strNew.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	
	StringBuilder sb = new StringBuilder();
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);	
	if (hm.get(c)>0)   {
	sb.append(hm.get(c));	
	}
	}
	System.out.println(sb);
	
	}
}
