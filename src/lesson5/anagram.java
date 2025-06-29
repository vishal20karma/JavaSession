package lesson5;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check if two strings are Anagram	
/*	String s1 = "cat";
	String s2 = "act";
	boolean b = anagram(s1,s2);
	System.out.println(b);
	
	}

	public static boolean anagram(String s1, String s2)   {
	if (s1.length()==s2.length())   {
	char [] chr1 = s1.toCharArray();	
	char [] chr2 = s2.toCharArray();
	Arrays.sort(chr1);
	Arrays.sort(chr2);
	boolean flag = Arrays.equals(chr1, chr1);   //Arrays comparison is done like this, it will not work like (chr1.equals(chr2))
 	if (flag)   {
	return true;
	}
	}
	return false;   */
		
//  For Practice
	String s1 = "cat";
	String s2 = "act";
	boolean b = anagram(s1, s2);
	System.out.println(b);
	
	}
	
    public static boolean anagram(String s1, String s2)   {
    if (s1.length()==s2.length())   {
    char [] chr1 = s1.toCharArray();	
    char [] chr2 = s2.toCharArray();
    Arrays.sort(chr1);
    Arrays.sort(chr2);
    boolean flag = Arrays.equals(chr1, chr2);
    if (flag)   {
    return true;	
    }
    }
    return false;   	
    }

}
