package highestFreq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class highestFrequency6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find max frequency and second highest frequency of String in an array list
/*	ArrayList<String> arl = new ArrayList<String>(Arrays.asList("c","java","python","ruby","java","c++","cobol","c","java"));	
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<arl.size();i++)   {
	String str = arl.get(i);
	hm.put(str, hm.getOrDefault(str, 0)+1);
	}
	String maxFreq = arl.get(0);
	String scndMaxFreq = arl.get(0);
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
	ArrayList<String> arl = new ArrayList<String>(Arrays.asList("c","java","python","ruby","java","c++","cobol","c","java"));	
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<arl.size();i++)   {
	String str = arl.get(i);
	hm.put(str, hm.getOrDefault(str, 0)+1);
	}
	String maxFreq = arl.get(0);
	String scndMaxFreq = arl.get(0);
	for (String key:hm.keySet())   {
	if (hm.get(key)>hm.get(maxFreq))   {
	maxFreq = key;	
	}
	else if (hm.get(key)>hm.get(scndMaxFreq) && hm.get(key)<hm.get(maxFreq))   {
	scndMaxFreq = key;	
	}
	}
	System.out.println("Max frequency: "+maxFreq);
	System.out.println("Second Max frequency: "+scndMaxFreq);		
	
	}

}
