package lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class oddEven2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check Odd/Even by Streams	
/*	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> even = list.stream().filter(s->s%2==0).collect(Collectors.toList());
	System.out.println(even);
	List<Integer> odd = list.stream().filter(s->s%2==1).collect(Collectors.toList());
	System.out.println(odd);   */
		
//  For Practice
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List<Integer> even = list.stream().filter(s->s%2==0).collect(Collectors.toList());
	System.out.println(even);
	List<Integer> odd = list.stream().filter(s->s%2==0).collect(Collectors.toList());
	System.out.println(odd);
	
	}

}
