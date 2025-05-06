package hashMapConcepts;

import java.util.HashMap;

public class hashMap5Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to compare HashMaps
	HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
	hm1.put(1, "India");
	hm1.put(2, "Burma");
	hm1.put(3, "Nepal");
	
	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	hm2.put(3, "Nepal");
	hm2.put(1, "India");
	hm2.put(2, "Burma");
	
	HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
	hm3.put(3, "Nepal");
	hm3.put(1, "India");
	hm3.put(2, "Burma");
	hm3.put(3, "Nepal");
	
	HashMap<Integer, String> hm4 = new HashMap<Integer, String>();
	hm4.put(4, "Nepal");
	hm4.put(1, "India");
	hm4.put(2, "Burma");
	hm4.put(3, "Nepal");
	
	HashMap<Integer, String> hm5 = new HashMap<Integer, String>();
	hm5.put(3, "Nepal");
	hm5.put(1, "India");
	hm5.put(2, "Burma");
	hm5.put(3, "Pakistan");
	
/*	System.out.println(hm1.equals(hm2));   //True
	System.out.println(hm1.equals(hm3));   //True - because it always picks the latest result in hashmap incase of duplicates, it do not depends on size
    System.out.println(hm1.equals(hm4));   //False - because 4th Key is unique
    System.out.println(hm1.equals(hm5));   */   //False - because 3rd value in hm5 is different and it picks latest result in direct comparison
	
//  For Practice
		
	System.out.println(hm1.equals(hm2));
	System.out.println(hm1.equals(hm3));
	System.out.println(hm1.equals(hm4));
	System.out.println(hm1.equals(hm5));
	
    System.out.println("*****************************");
    
/*  System.out.println(hm1.keySet().equals(hm2.keySet()));   //True
    System.out.println(hm1.keySet().equals(hm3.keySet()));   //True - Same logic as above
	System.out.println(hm1.keySet().equals(hm4.keySet()));   //False - because 4th Key is unique
	System.out.println(hm1.keySet().equals(hm5.keySet()));   */   //True - KeySet adds/compare unique and ignores duplicate keys(it result false when directly compared like above)
	
//  For Practice
    System.out.println(hm1.keySet().equals(hm2.keySet()));
	System.out.println(hm1.keySet().equals(hm3.keySet()));
	System.out.println(hm1.keySet().equals(hm4.keySet()));
	System.out.println(hm1.keySet().equals(hm5.keySet()));
	}

}
