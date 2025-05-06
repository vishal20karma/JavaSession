package duplicateConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElements5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find duplicate elements by using Streams	
/*	List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,5,6,6,7,8,9,10,10);	
	Set<Integer> dup = list.stream().filter(s->Collections.frequency(list, s)>1).collect(Collectors.toSet());
	System.out.println(dup);   */
	
//  For Practice
	List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,5,6,6,7,8,9,10,10);
	Set<Integer> dup = list.stream().filter(s->Collections.frequency(list, s)>1).collect(Collectors.toSet());
	System.out.println(dup);
	}

}
