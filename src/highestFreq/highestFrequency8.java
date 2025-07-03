package highestFreq;

import java.util.HashMap;

public class highestFrequency8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find the maximum and second maximum occurrence of a character in an Array of Strings
/*	String str = "";   //String declared above so that it can be accessed in the enhance loop below
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length;i++)   {
	str = s[i];	
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	}
	char maxFreq = str.charAt(0);
	char scndMaxFreq = str.charAt(0);
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
	String [] s = {"2ab", "kl1", "hg22u", "rr2"};
	String str="";
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for (int i=0;i<s.length;i++)   {
	str = s[i];	
	for (int j=0;j<str.length();j++)   {
	char c = str.charAt(j);
	hm.put(c, hm.getOrDefault(c, 0)+1);
	}
	}
	char maxFreq = str.charAt(0);
	char scndMaxFreq = str.charAt(0);
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
