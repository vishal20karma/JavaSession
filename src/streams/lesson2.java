package streams;

import java.util.ArrayList;

public class lesson2 {

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

//	a.stream().filter(s->s.endsWith("n")).forEach(s->System.out.println(s));
	a.stream().filter(s->s.endsWith("n")).forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
//  Printing the names ending with particular suffix and with Upper case
//	a.stream().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	a.stream().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
//	a.stream().filter(s->s.endsWith("n")).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	a.stream().filter(s->s.endsWith("n")).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
//	a.stream().sorted().forEach(s->System.out.println(s));
	a.stream().sorted().forEach(s->System.out.println(s));
	
	System.out.println("********************");
	
//	a.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	a.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	System.out.println("********************");
//	a.stream().sorted().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	a.stream().sorted().filter(s->s.endsWith("n")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	}

}
