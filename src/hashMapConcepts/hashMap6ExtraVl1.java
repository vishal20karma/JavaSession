package hashMapConcepts;

import java.util.HashMap;
import java.util.HashSet;

public class hashMap6ExtraVl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find extra value in HashMap
	HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
	hm1.put(1, "India");
	hm1.put(2, "Burma");
	hm1.put(3, "Nepal");
			
	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	hm2.put(1, "India");
	hm2.put(2, "Burma");
	hm2.put(3, "Nepal");
	hm2.put(4, "Pakistan");
	
/*	HashSet<Integer> ck = new HashSet<Integer>(hm1.keySet());
	ck.addAll(hm2.keySet());
	ck.removeAll(hm1.keySet());
	System.out.println(ck);   */
	
//  For Practice
	HashSet<Integer> ck = new HashSet<Integer>(hm1.keySet());
	ck.addAll(hm2.keySet());
	ck.removeAll(hm1.keySet());
	System.out.println(ck);
	}

}
