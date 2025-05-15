package highestFreq;

import java.util.HashMap;

public class highestFrequency4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find max frequency and second highest frequency of String in an array string		
/*	String [] s = {"c","java","python","ruby","java","c++","cobol","c","java"};
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<s.length;i++)   {
	String str = s[i];
	if (hm.containsKey(str))   {
	int oldFreq = hm.get(str);	
	int newFreq = oldFreq+1;
	hm.put(str, newFreq);
	}
	else {
	hm.put(str, 1);	
	}
	}
    String maxFreq = s[0];
	String scndMaxFreq = s[0];
	for (String key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq = key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq = key;	
	}
	}
	System.out.println("Max frequency: "+maxFreq);
	System.out.println("Second Max frequency: "+scndMaxFreq);   */
		
//  For Practice
	String [] s = {"c","java","python","ruby","java","c++","cobol","c","java"};
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<s.length;i++)   {
	String str = s[i];	
	if (hm.containsKey(str))   {
	int oldFreq = hm.get(str);
	int newFreq = oldFreq+1;
	hm.put(str, newFreq);
	}
	else {
	hm.put(str, 1);	
	}
	}
	String maxFreq = s[0];
	String scndMaxFreq = s[0];
	for (String key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq=key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq=key;	
	}
	}
	System.out.println("Max frequency: "+maxFreq);
	System.out.println("Second Max frequency: "+scndMaxFreq);
	
	}

}
