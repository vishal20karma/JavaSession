package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.Assert;

public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Suman");
	a.add("Ranjan");
	a.add("Sushant");

	ArrayList<String> b = new ArrayList<String>();
	b.add("Vikrant");
	b.add("Ravi");
	b.add("Kia");
	b.add("Rohit");
	b.add("Anand");
	
//  Concatenating two streams
/*	Stream<String> c1 = Stream.concat(a.stream(), b.stream());
	c1.sorted().forEach(s->System.out.println(s));   */
	
//  For Practice
	Stream<String> c1 = Stream.concat(a.stream(), b.stream());
	c1.sorted().forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
//  Concatenate and sort, once Stream is modified then again operations will not work, therefore created c2	
/*	Stream<String> c2 = Stream.concat(a.stream(), b.stream());
	boolean flag = c2.anyMatch(s->s.equalsIgnoreCase("Sushant"));
	System.out.println(flag);
	Assert.assertTrue(flag);   */
	
//  For Practice
	Stream<String> c2 = Stream.concat(a.stream(), b.stream());
	boolean flag = c2.anyMatch(s->s.equalsIgnoreCase("Sushant"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	
	}
}
