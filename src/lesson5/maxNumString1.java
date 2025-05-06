package lesson5;

import java.util.ArrayList;

public class maxNumString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find maximum number in a string
/*	String s = "@abc1hgnh12jhh07";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	String str = String.valueOf(c);	
	arl.add(Integer.parseInt(str));
	}
	}
	System.out.println(arl);
	int min = arl.get(0);
	int max = arl.get(0);
	for (int j=1;j<arl.size();j++)   {
	if (arl.get(j)<min)   {
	min = arl.get(j);	
	}
	else if (arl.get(j)>max)   {
	max = arl.get(j);	
	}
	}
	System.out.println("Min number: "+min);
	System.out.println("Max number: "+max);   */
		
//  For Practice
	String s = "@abc1hgnh12jhh07";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	String str = String.valueOf(c);
	arl.add(Integer.parseInt(str));
	}
	}
	System.out.println(arl);
	int min = arl.get(0);
	int max = arl.get(0);
	for (int j=1;j<arl.size();j++)   {
	if (arl.get(j)<min)   {
	min=arl.get(j);	
	}
	else if (arl.get(j)>max)   {
	max=arl.get(j);	
	}
	}
	System.out.println("Min number: "+min);
	System.out.println("Max number: "+max);
	
	}    
}
