package highestFreq;

import java.util.HashMap;

public class highestFrequency9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find the maximum and second maximum occurrence of a character in an Array of Strings
/*	String str = "";   //String declared above so that it can be accessed in the enhance loop below
	String [] s = {"2abb3", "klbb1", "3hbg22u", "rr2", "3rb2"};
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length;i++)   {
	str = s[i];
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);
	if (hm.containsKey(c) && Character.isDigit(c))   {
	int oldFreq = hm.get(c);
	int newFreq = oldFreq+1;
	hm.put(c, newFreq);
	}
	else {
	hm.put(c, 1);	
	}
	}
	}
	char maxFreq = str.charAt(0);
	char scndMaxFreq = str.charAt(0);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq = key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq = key;	
	}
	}
	System.out.println("Maximum frequency: "+maxFreq);
	System.out.println("Second Maximum frequency: "+scndMaxFreq);   */
		
//  For Practice
	String str = "";   //String declared above so that it can be accessed in the enhance loop below
	String [] s = {"2abb3", "klbb1", "3hbg22u", "rr2", "3rb2"};
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length;i++)   {
	str = s[i];
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);
	if (hm.containsKey(c) && Character.isDigit(c))   {   //'Character.isDigit(c)' is used if only Integers need to evaluate, if not used then it will evaluate Integers and Alphabets both. If used with '!' then it will only check for Alphabets
	int oldFreq = hm.get(c);
	int newFreq = oldFreq+1;
	hm.put(c, newFreq);
	}
	else {
	hm.put(c, 1);	
	}
	}
	}
	char maxFreq = str.charAt(0);
	char scndMaxFreq = str.charAt(0);
	for (Character key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq = key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq = key;	
	}
	}
	System.out.println("Maximum frequency: "+maxFreq);
	System.out.println("Second Maximum frequency: "+scndMaxFreq);
	
	}

}
