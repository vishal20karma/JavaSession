package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class stringSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to sort a string by using Arrays.sort();
/*	String str = "automation";	
	char [] chr = str.toCharArray();
	Arrays.sort(chr);	
	String sorted = new String(chr);
	System.out.println(sorted);   */
		
//  For Practice
	String str = "Automation";
	char [] chr = str.toLowerCase().toCharArray();
	Arrays.sort(chr);
    String sorted = new String(chr);
	System.out.println(sorted);
	
//  How sort a string by using Collections.sort();
/*	String s = "Programming";
	char [] c = s.toLowerCase().toCharArray();
	ArrayList<Character> arl = new ArrayList<Character>();
	for (int i=0;i<c.length;i++)   {
	arl.add(c[i]);
	}
	Collections.sort(arl);
	System.out.println(arl);
//	Collections.reverse(arl);   //Reverse on Sorted ArrayList (Imp-There is difference between reverse and reverse Order)
//	System.out.println(arl);
	String rev="";
	for (Character chrs:arl)   {   //ArrayList can be directly used for enhanced loop by their element type
	rev=rev+chrs;	
	}
	System.out.println(rev);   */
	
//  For Practice
	String s = "Programming";
	char [] c = s.toLowerCase().toCharArray();
	ArrayList<Character> arl = new ArrayList<>();
	for (int i=0;i<c.length;i++)   {
	arl.add(c[i]);	
	}
	Collections.sort(arl);
	System.out.println(arl);
//	Collections.reverse(arl);
//	System.out.println(arl);
	String rev="";
	for (Character chrs:arl)   {
	rev=rev+chrs;
	}
	System.out.println(rev);
	
	}
}
