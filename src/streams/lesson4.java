package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Printing first String
//	Stream.of("Vikrant","Ravi","Kia","Rohit","Anand").limit(1).forEach(s->System.out.println(s));	
	Stream.of("Vikrant","Ravi","Kia","Rohit","Anand").limit(1).forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
/*	List<String> str = Stream.of("Vikrant","Ravi","Kia","Rohit","Anand")   //How to put stream to list
	        .filter(s->s.startsWith("R")).collect(Collectors.toList());
	System.out.println(str.get(0));   */   //It gives the Zeroth index value
	
//  For Practice
	List<String> str = Stream.of("Vikrant","Ravi","Kia","Rohit","Anand")
	        .filter(s->s.startsWith("R")).collect(Collectors.toList());
	System.out.println(str.get(0));
	
	System.out.println("********************");
	
//  How to find unique numbers and sort
/*	List<Integer> values = Arrays.asList(3,2,6,7,7,3,1,9);
	values.stream().distinct().sorted().forEach(s->System.out.println(s));   */
	List<Integer> values = Arrays.asList(3,2,6,7,7,3,1,9);
	values.stream().distinct().sorted().forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
/*	List<Integer> sdV = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(sdV);   //Whole List will print as it has been thrown into collectors list
	sdV.forEach(s->System.out.println(s));   //Will print all values one by one
	System.out.println(sdV.get(2));   */
	
//  For Practice
	List<Integer> sdV = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(sdV);
	sdV.forEach(s->System.out.println(s));
	System.out.println(sdV.get(2));
	
	}

}
