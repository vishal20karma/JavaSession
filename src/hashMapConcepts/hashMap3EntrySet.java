package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashMap3EntrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  By Entry set we can directly fetch Key and Value
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
	Iterator<Entry<String, String>> et = cc.entrySet().iterator();
	while (et.hasNext())   {
	Entry<String, String> entry = et.next();	
	System.out.println("Key="+entry.getKey()+" : "+"Value="+entry.getValue());   */
		
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
	Iterator<Entry<String, String>> et = cc.entrySet().iterator();
	while (et.hasNext())   {
	Entry<String, String> entry = et.next();	
	System.out.println("Key="+entry.getKey()+" : "+"Value="+entry.getValue());
	}

	
	}

}
