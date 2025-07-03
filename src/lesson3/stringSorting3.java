package lesson3;

import java.util.Arrays;

public class stringSorting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to sort list of characters without using Arrays.sort();
/*	String [] str = {"dad","cat","tac","rat","pat","chat","hbt","hat"};
	for (int i=0;i<str.length-1;i++)   {
	for (int j=0;j<str.length-1-i;j++)   {
	if (str[j].compareTo(str[j+1])>0)   {   //compareTo() compares two strings lexicographically (alphabetically)
//	if (str[j].compareTo(str[j+1])<0)   {    //'>' means atleast there is comparison result, if '==' then strings are equal, if '<' the that means reverse order
	String temp=str[j];                      //Use '>' for sorting, '<' for reverse Sorting, '==' for moving same strings to last, '!=' for moving same strings to beginning
	str[j]=str[j+1];
	str[j+1]=temp;
	}
	}
	}
	System.out.println(Arrays.toString(str));   //This helps to print the string into readable format, else direct prints results in memory address or hash code
*/
		
//  For Practice
	String [] str = {"dad","cat","tac","rat","pat","chat","hbt","hbt"};	
	for (int i=0;i<str.length-1;i++)   {
	for (int j=0;j<str.length-1-i;j++)   {
	if ((str[j].compareTo(str[j+1])>1))   {
//	if (str[j].compareTo(str[j+1])<0)   {		
	String temp=str[j];
	str[j]=str[j+1];
	str[j+1]=temp;
	}
	}
	}
	System.out.println(Arrays.toString(str));
	
	}
}
