package lesson4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondThirdMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to get second highest and second lowest number (If have any Array then its better to convert into ArrayList and then do operations)	
/*	List<Integer> list = Arrays.asList(9,11,9,0,0,7,5,2,2,1,15);
	int sMin = list.stream().sorted().distinct().skip(1).findFirst().get();
	System.out.println(sMin);
	int sMax = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();   //How to get second highest number, mandate to use reverse and reverse can only done by Collections
	System.out.println(sMax);   */
	
//  For Practice
	List<Integer> list =  Arrays.asList(9,11,9,0,0,7,5,2,2,1,15);
	int sMin = list.stream().sorted().distinct().skip(1).findFirst().get();
	System.out.println(sMin);
	int sMax = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
	System.out.println(sMax);
	
	System.out.println("**************************************");
	
/*	List<Integer> list2 = Arrays.asList(9,11,9,0,0,7,5,2,2,1,15);	
	int tMin = list2.stream().sorted().distinct().skip(2).findFirst().get();
	System.out.println(tMin);
	int tMax = list2.stream().sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get();
	System.out.println(tMax);   */
	
//  For Practice
	List<Integer> list2 = Arrays.asList(9,11,9,0,0,7,5,2,2,1,15);
	int tMin = list2.stream().sorted().distinct().skip(2).findFirst().get();
	System.out.println(tMin);
	int tMax = list2.stream().sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get();
	System.out.println(tMax);
	}

}
