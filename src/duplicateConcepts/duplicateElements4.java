package duplicateConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateElements4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to remove duplicate elements from an ArrayList or Only store common elements	
//  If has Array then convert that to ArrayList	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList("c","java","python","ruby","c++","cobol","c","java"));
/*	HashSet<String> hs = new HashSet<String>(al);
	System.out.println(hs);   */
	
//  For Practice
	HashSet<String> hs = new HashSet<String>(al);
	System.out.println(hs);
	
/*	LinkedHashSet<String> lhs = new LinkedHashSet<String>(al);
	System.out.println(lhs);   */
	
//  For Practice
	LinkedHashSet<String> lhs = new LinkedHashSet<String>(al);
    System.out.println(lhs);
    
//  Streams method
/*	List<String> strList = al.stream().distinct().collect(Collectors.toList());
	System.out.println(strList);   */
	
//  For Practice
	List<String> strList = al.stream().distinct().collect(Collectors.toList());	
	System.out.println(strList);
	
	}

}
