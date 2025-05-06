package lesson3;

import java.util.stream.IntStream;

public class one2Hundred1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print 1 to 100 without using any number
/*	int one = 'x'/'x';
	String s = "**********";
	for (int i=one; i<=s.length()*s.length();i++)   {
	System.out.println(i);	
	}   */
	
//  For Practice
	int one='x'/'x';
	String s="**********";
	for (int i=one;i<=s.length()*s.length();i++)   {
	System.out.println(i);	
	}
	
	System.out.println("***********************************");
	
//  Another method   //ASCII value of a=97, therefore b=98, c=99, d=100
/*	for (int j=one;j<='d';j++)   {
	System.out.println(j);	
	}   */
	
//  For Practice
	for (int j=one;j<='d';j++)   {
	System.out.println(j);	
	}
	
	System.out.println("***********************************");
	
//  Printing 1 to 100 by using Streams, note - here numbers are used, also lamba expression cannot be 's' in case of integers, it can be any other character
//	IntStream.range(1, 101).forEach(i->System.out.println(i));   //Always use end range '+1' as it always start from -1
	
//  For Practice
	IntStream.range(1, 101).forEach(i->System.out.println(i));
	
	}

}
