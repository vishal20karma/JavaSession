package replaceConcepts;

import java.util.ArrayList;

public class replaceStringToASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to replace all characters of a string with its ASCII values and compare min/max number
/*	String str  = "Automation";
	String result="";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	int chr = (int)c;
	arl.add(chr);
	result=result+chr+" ";
	}
	System.out.println(arl);
	System.out.println(result);
	
	int min = arl.get(0);
	int max = arl.get(0);
	for (int i=1;i<arl.size();i++)   {
	if (arl.get(i)<min)   {
	min=arl.get(i);	
	}
	else if (arl.get(i)>max)   {
	max=arl.get(i);	
	}
	}
	System.out.println("Min number: "+min);
	System.out.println("Max number: "+max);   */
		
//  For Practice
	String str  = "Automation";
	String result="";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	int chr = (int)c;
	arl.add(chr);
	result=result+chr+" ";
	}
	System.out.println(arl);
	System.out.println(result);
	
	int min = arl.get(0);
	int max = arl.get(0);
	for (int i=1;i<arl.size();i++)   {
	if (arl.get(i)<min)   {
	min=arl.get(i);	
	}
	else if (arl.get(i)>max)   {
	max=arl.get(i);	
	}
	}
	System.out.println("Min number: "+min);
	System.out.println("Max number: "+max);
	
	}

}
