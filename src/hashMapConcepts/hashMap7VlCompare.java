package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class hashMap7VlCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to compare on the basis of values
		
	HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
	hm1.put(1, "India");
	hm1.put(2, "Burma");
	hm1.put(3, "Nepal");
			
	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
	hm2.put(4, "India");
	hm2.put(5, "Burma");
	hm2.put(6, "Nepal");
			
	HashMap<Integer, String> hm3 = new HashMap<Integer, String>();
	hm3.put(1, "India");
	hm3.put(2, "Burma");
	hm3.put(3, "Nepal");
	hm3.put(4, "Nepal");
		
//  Comparing with the help of ArrayList and on the basis of Values		

/*	ArrayList<String> al1 = new ArrayList<String>(hm1.values());   //Values are string that is why String ArrayList used
	ArrayList<String> al2 = new ArrayList<String>(hm2.values());
	ArrayList<String> al3 = new ArrayList<String>(hm3.values());
	System.out.println(al1.equals(al2));   //Values are string that is why String ArrayList used
	System.out.println(al1.equals(al3));   */   //False -  because ArrayList do not ignore duplicates values
	
//  For Practice
	ArrayList<String> al1 = new ArrayList<String>(hm1.values());
	ArrayList<String> al2 = new ArrayList<String>(hm2.values());
	ArrayList<String> al3 = new ArrayList<String>(hm3.values());
	System.out.println(al1.equals(al2));
	System.out.println(al1.equals(al3));
	
	System.out.println("**************************************");
	
/*	ArrayList<Integer> nal1 = new ArrayList<Integer>(hm1.keySet());
	ArrayList<Integer> nal2 = new ArrayList<Integer>(hm2.keySet());
	ArrayList<Integer> nal3 = new ArrayList<Integer>(hm3.keySet());
	System.out.println(nal1.equals(nal2));   //False - because comparison is on Keys and its different in both ArrayLists
	System.out.println(nal1.equals(nal3));   */  //False -  because ArrayList do not ignore duplicates values
	
//  For Practice
	ArrayList<Integer> nal1 = new ArrayList<Integer>(hm1.keySet());
	ArrayList<Integer> nal2 = new ArrayList<Integer>(hm2.keySet());
	ArrayList<Integer> nal3 = new ArrayList<Integer>(hm3.keySet());
	System.out.println(nal1.equals(nal2));
	System.out.println(nal1.equals(nal3));
	
	System.out.println("**************************************");
	
//  Comparing with the help of HashSet on the basis of Values
/*	HashSet<String> hh1 = new HashSet<String>(hm1.values());
	HashSet<String> hh2 = new HashSet<String>(hm2.values());
	HashSet<String> hh3 = new HashSet<String>(hm3.values());
	System.out.println(hh1.equals(hh2));   //True - because values are same even if Key is different
	System.out.println(hh1.equals(hh3));   */   //True - because HashSet ignore the duplicate values
	
//  For Practice
	HashSet<String> hh1 = new HashSet<String>(hm1.values());
	HashSet<String> hh2 = new HashSet<String>(hm2.values());
	HashSet<String> hh3 = new HashSet<String>(hm3.values());
	System.out.println(hh1.equals(hh2));
	System.out.println(hh1.equals(hh3));
	
	System.out.println("**************************************");
	
//  Comparing with the help of HashSet on the basis of Keys	
/*	HashSet<Integer> nhh1 = new HashSet<Integer>(hm1.keySet());
	HashSet<Integer> nhh2 = new HashSet<Integer>(hm2.keySet());
	HashSet<Integer> nhh3 = new HashSet<Integer>(hm3.keySet());
	System.out.println(nhh1.equals(nhh2));   //False - Because Keys are different in both sets
	System.out.println(nhh1.equals(nhh3));   */   //False - Because hm3 has one additional key and HashSet will not ignore it, (Only while adding it ignore the duplicates)
	
//  For Practice
	HashSet<Integer> nhh1 = new HashSet<Integer>(hm1.keySet());
	HashSet<Integer> nhh2 = new HashSet<Integer>(hm2.keySet());
	HashSet<Integer> nhh3 = new HashSet<Integer>(hm3.keySet());
	System.out.println(nhh1.equals(nhh2));
	System.out.println(nhh1.equals(nhh3));
	
	}

}
