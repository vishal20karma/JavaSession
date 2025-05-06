package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Ranjan");
	a.add("Suman");
	a.add("Sushant");   */
		
//  For Practice
	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Ranjan");
	a.add("Suman");
	a.add("Sushant");
			
//  Stream.of("Vishal","Vivek","Ranjan","Suman","Sushant");   //How to directly write names in Streams
	a.stream().forEach(s->System.out.println(s));   //Printing all names
//  a.forEach(s->System.out.println(s));
    
    System.out.println("********************");
    
/*	long l1 = a.stream().count();   //Return type is 'Long' in stream
	System.out.println(l1);   */    //Printing total count

//  For Practice
    long l1 = a.stream().count();
	System.out.println(l1);
    
	System.out.println("********************");
	
/*	long l2 = a.stream().filter(s->s.startsWith("S")).count();   //Filtering the names and taking count
	System.out.println(l2);   */
	
//  For Practice
	long l2 = a.stream().filter(s->s.startsWith("S")).count();
	System.out.println(l2);
	
	System.out.println("********************");
	
/*	long l3 = a.stream().filter(s->s.length()>5).count();   //Printing names greater than 5 character length
	System.out.println(l3);   */
	
//  For Practice
	long l3 = a.stream().filter(s->s.length()>5).count();
	System.out.println(l3);
	
	System.out.println("********************");
	
//	a.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));   //Printing names greater than 5 character and limiting the count
	a.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
	
	}

}
