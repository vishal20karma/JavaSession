package highestFreq;

import java.util.HashMap;

public class highestFrequency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find max frequency and second highest frequency of a character in a string		
/*	String s =  "My Good Responsibilities";
	s=s.toLowerCase().replaceAll("\\s", "");
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	char maxFreq=s.charAt(0);
	char scndMaxFreq=s.charAt(0);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq=key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq=key;
	}
	}
    System.out.println("Max frequency: "+maxFreq);
    System.out.println("Second Max : "+scndMaxFreq);   */
		
//  For Practice
	String s =  "My Good Responsibilities";
	s=s.toLowerCase().replaceAll("\\s", "");
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	System.out.println(hm);
	char maxFreq=s.charAt(0);
	char scndMaxFreq=s.charAt(0);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq=key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq=key;
	}
	}
    System.out.println("Max frequency: "+maxFreq);
    System.out.println("Second Max : "+scndMaxFreq);
	
	}
}
