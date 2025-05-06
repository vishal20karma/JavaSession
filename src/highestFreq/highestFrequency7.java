package highestFreq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class highestFrequency7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find max frequency and second highest frequency of an integer in an array		
/*	ArrayList<Integer> arl = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,4,5,5,5,5,6,7,9,10,1));
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	for (int i=0;i<arl.size();i++)   {
	int n = arl.get(i);	
	if (hm.containsKey(n))   {
	int oldFreq = hm.get(n);	
	int newFreq = oldFreq+1;
	hm.put(n, newFreq);
	}
	else {
	hm.put(n, 1);	
	}
	}
	int maxFreq = arl.get(0);
	int scndMaxFreq = arl.get(0);
	for (int key:hm.keySet())   {
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
	ArrayList<Integer> arl = new ArrayList<Integer>(Arrays.asList(1,1,2,2,3,4,5,5,5,5,6,7,9,10,1));
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	for (int i=0;i<arl.size();i++)   {
	int n = arl.get(i);	
	if (hm.containsKey(n))   {
	int oldFreq = hm.get(n);	
	int newFreq = oldFreq+1;
	hm.put(n, newFreq);
	}
	else {
	hm.put(n, 1);	
	}
	}
	int maxFreq = arl.get(0);
	int scndMaxFreq = arl.get(0);
	for (int key:hm.keySet())   {
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
