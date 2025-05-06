package hashMapConcepts;

import java.util.HashMap;

public class hashMap1KeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//  HashMap Concept, its based on Key and its Values, it does not follow order or indexing
//  Key cannot be duplicate, if made duplicate then only the latest key value will be fetched
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
	
	
	System.out.println(cc.get("USA"));
	System.out.println(cc.get("UK"));
	System.out.println(cc.get("London"));   //If values will be place to get Key, then it returns null
	System.out.println(cc.get("Russia"));   //Duplicate Key always fetch latest value
	System.out.println(cc.get(null));   //Duplicate Key always fetch latest value even for Null key
	System.out.println(cc.get("Pakistan"));   */   //Duplicate Key always fetch latest value even for Null values
	
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
	
	System.out.println(cc.get("USA"));
	System.out.println(cc.get("UK"));
	System.out.println(cc.get("Russia"));
	System.out.println(cc.get(null));
	System.out.println(cc.get("Pakistan"));
	
	}

}
