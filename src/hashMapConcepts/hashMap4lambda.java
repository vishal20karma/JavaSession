package hashMapConcepts;

import java.util.HashMap;

public class hashMap4lambda {

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
	cc.forEach((k,v)->System.out.println("Key="+k+" : "+"Value="+v));   */
	
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
	cc.forEach((k,v)->System.out.println("Key="+k+" : "+"Value="+v));
	
	}

}
