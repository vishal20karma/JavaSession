package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap2Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	HashMap<String, String> cc = new HashMap<String, String>();
	cc.put("India", "New Delhi");
	cc.put("USA", "Washington DC");
	cc.put("UK", "London");
	cc.put("Russia", "Moscow1");
	cc.put("Russia", "Moscow2");
	cc.put(null, "Pakistan1");
	cc.put(null, "Pakistan2");
	cc.put("Pakistan", null);
	cc.put("Pakistan", null);
	cc.remove(null);   //This is to remove any key and its value, if duplicate then both will be removed and will not print
	Iterator<String> it = cc.keySet().iterator();
	while (it.hasNext())   {
	String key = it.next();
	String value = cc.get(key);
	System.out.println("Key="+key+" : "+"Value="+value);
	}   */
		
//  For Practice
	HashMap<String, String> cc = new HashMap<String, String>();
	cc.put("India", "New Delhi");
	cc.put("USA", "Washington DC");
	cc.put("UK", "London");
	cc.put("Russia", "Moscow1");
	cc.put("Russia", "Moscow2");
	cc.put(null, "Pakistan1");
	cc.put(null, "Pakistan2");
	cc.put("Pakistan", null);
	cc.put("Pakistan", null);
	cc.remove(null);
	Iterator<String> it = cc.keySet().iterator();
	while (it.hasNext())   {
	String key = it.next();	
	String value = cc.get(key);
	System.out.println("Key="+key+" : "+"Value="+value);
	}
	
	}

}
