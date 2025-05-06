package lesson5;

import java.util.ArrayList;

public class maxNumString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to fin min/max number if having 2 digits whole number in a string		
/*	String s = "@abc1hgnh12jhh07joat13lk8lah41";
	ArrayList<String> arl = new ArrayList<String>();
	String num="";
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;
	}
	else {
	if (!num.equals(""))   {
	arl.add(num);
	num="";
	}
	}
	}
	if (!num.equals(""))   {
	arl.add(num);
	}
	System.out.println(arl);
//  Converting String ArrayList to Integer ArrayList	
	ArrayList<Integer> arlInt = new ArrayList<Integer>();
	for (String str:arl)   {
	int k = Integer.parseInt(str);	
	arlInt.add(k);
	}
	System.out.println(arlInt);
//  Comparing all the Integers for min/max	
	int min = arlInt.get(0);
	int max = arlInt.get(0);
	for (int j=1;j<arlInt.size();j++)   {
	if (arlInt.get(j)<min)   {
	min=arlInt.get(j);
	}
	else if (arlInt.get(j)>max)   {
	max=arlInt.get(j);	
	}
	}
	System.out.println("Minimum number: "+min);
	System.out.println("Maximum number: "+max);   */
		
//  For Practice
	String s = "@abc1hgnh12jhh07joat13lk8lah41";
	String num="";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;	
	}
	else {
	if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
	num="";
	}
	}
	}
	if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
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
	System.out.println("Minimum number: "+min);
	System.out.println("Maximum number: "+max);
	
	}

}
