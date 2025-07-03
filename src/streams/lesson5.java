package streams;

import java.util.Arrays;
import java.util.List;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Adding all the numbers in an ArrayList
/*	List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	int sumOfAll = num.stream().reduce((a,b)->a+b).get();
	System.out.println(sumOfAll);   */
		
//  For Practice
	List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	int sumOfAll = num.stream().reduce((a,b)->a+b).get();
	System.out.println(sumOfAll);
	
	System.out.println("************************");
	
//  Adding only first 5 numbers
/*	int fstFive = num.stream().limit(5).reduce((a,b)->a+b).get();
	System.out.println(fstFive);   */
	
//  For Practice	
	int fstFive = num.stream().limit(5).reduce((a,b)->a+b).get();
	System.out.println(fstFive);
	
	System.out.println("************************");
	
//  Adding after skipping first 5
/*	int skpFstFive = num.stream().skip(5).reduce((a,b)->a+b).get();
	System.out.println(skpFstFive);   */
	
//  For Practice	
	int skpFstFive = num.stream().skip(5).reduce((a,b)->a+b).get();
	System.out.println(skpFstFive);
	
	}

}
