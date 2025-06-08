 package duplicateConcepts;

import java.util.HashMap;

public class duplicateElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find duplicate elements in an array	
/*	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
	for (int i=0;i<s.length;i++)   {
	int count=1;   //if 1 then it will give total duplicate, if 0 then it will give repeating duplicate only
	for (int j=i+1;j<s.length;j++)   {
	if (s[i].equals(s[j]))   {
	count++;
	System.out.println(s[i]+" : "+count);
	}
	}
	}   */
		
//  For Practice
	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
    for (int i=0;i<s.length;i++)   {
    int count=1;	
    for (int j=i+1;j<s.length;j++)   {
    if (s[i].equals(s[j]))   {
    count++;
    System.out.println(s[i]+" : "+count);
    }
    }
    }
    
    System.out.println("***********************************");
	
//  By Using HashMap
    String [] str = {"c","java","python","ruby","c++","cobol","c","java",".net"};
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<str.length;i++)   {
	String st = str[i];	
	hm.put(st, hm.getOrDefault(st, 0)+1);
	}
	System.out.println(hm);
	for (String key:hm.keySet())   {
	int count=1;
	if (hm.get(key)>1)   {
	count++;
	System.out.println(key+" : "+count);
	}
	}
	
	}

}
