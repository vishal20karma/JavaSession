package lesson5;

import java.util.Arrays;
import java.util.List;

public class sqrFilterAvg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Square, then do filter greater than 100, then average it by using Streams	
/*	List<Integer> list = Arrays.asList(1,2,3,7,10,15,20,25,30);
	double avg = list.stream().map(s->s*s)
			.filter(s->s>100)
			   .mapToDouble(s->s)
			      .average().getAsDouble();
	System.out.println(avg);   */
		
//  For Practice
	List<Integer> list = Arrays.asList(1,2,3,7,10,15,20,25,30);
	double avg = list.stream().map(s->s*s)
			.filter(s->s>100)
			   .mapToDouble(s->s)
			      .average().getAsDouble();
	System.out.println(avg);
		
	}

}
