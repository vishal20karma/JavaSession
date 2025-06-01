package duplicateConcepts;

import java.util.HashMap;

public class duplicateStrings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Finding duplicate strings given in a sentence by using HashMap
	String s = "Google is the most popular search engine in the most world. Bing most comes at number two most";	
    String [] spls = s.split(" ");
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i=0;i<spls.length;i++)   {
	String str = spls[i];	
	hm.put(str, hm.getOrDefault(str, 0)+1);
	}
	System.out.println(hm);
	for (String key:hm.keySet())   {
	if (hm.get(key)>1)   {
	System.out.println(key+" : "+hm.get(key));	
	}
	}
	}

}
