package highestFreq;

import java.util.HashMap;

public class highestFrequency2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find max frequency and second highest frequency of a digit in a string		
/*	String s = "345445678497664";
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    for (int i=0;i<s.length();i++)   {
    char c = s.charAt(i);
    hm.put(c, hm.getOrDefault(c, 0)+1);
    }
    System.out.println(hm);
	char maxFreq = s.charAt(0);
	char scndMaxFreq = s.charAt(0);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq=key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq=key;	
	}
	}
	System.out.println("Maximum frequency: "+maxFreq);
	System.out.println("Second Maximum frequency: "+scndMaxFreq);   */
		
//  For Practice
	String s = "345445678497664";
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
	System.out.println("Maximum frequency: "+maxFreq);
	System.out.println("Second Maximum frequency: "+scndMaxFreq);

	}
}
